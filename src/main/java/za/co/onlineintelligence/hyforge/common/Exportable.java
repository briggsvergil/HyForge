package za.co.onlineintelligence.hyforge.common;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import za.co.onlineintelligence.hyforge.common.annotations.DTODeflate;
import za.co.onlineintelligence.hyforge.common.annotations.Deflate;
import za.co.onlineintelligence.hyforge.common.annotations.DelegateDeflate;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.getAllFields;

public interface Exportable {
    /**
     * Serialize all fields in a class recursively with custom serialization support.
     *
     * @return
     */
    default JsonElement serializeClass() {
        Gson res = new Gson();
        JsonObject outerNode = new JsonObject();

        List<Field> fields = new ArrayList<>();
        fields = getAllFields(fields, this.getClass());

        for (Field f : fields) {
//            Annotation[] annotations = f.getAnnotations();
            /*
            Collect and aggregate all fields from subclass if field is marked with DataTransferObjectDeflate annotation.
            Ignore conflicting keys.
             */
            if (f.isAnnotationPresent(DTODeflate.class)) {
                Object value = getValue(f);
                if (value instanceof JsonObject) {
                    for (Map.Entry<String, JsonElement> rightEntry : ((JsonObject) value).entrySet()) {
                        String rightKey = rightEntry.getKey();
                        if (!outerNode.has(rightKey)) {
                            JsonElement rightVal = rightEntry.getValue();
                            outerNode.add(rightKey, rightVal);
                        }
                    }
                }
            } else {
                //KEY
                String key = f.getName();
                //override key if deflate annotation is present
                if (f.isAnnotationPresent(Deflate.class)) {
                    Deflate annotation = f.getAnnotation(Deflate.class);
                    String name = annotation.serializeName();
                    key = !name.isEmpty() ? name : key;
                }

                //VALUE
                Object value = null;
                if(f.isAnnotationPresent(DelegateDeflate.class)) {
                    value = getDelegatedValue(f);
                } else {
                    value = getValue(f);
                }
                if (value == null) continue;
                if (value instanceof JsonElement) {
                    outerNode.add(key, (JsonElement) value);
                } else if (value instanceof Number) {
                    outerNode.addProperty(key, (Number) value);
                } else if (value instanceof String) {
                    outerNode.addProperty(key, (String) value);
                } else if (value instanceof Boolean) {
                    outerNode.addProperty(key, (Boolean) value);
                }
            }
        }

        return outerNode;
    }

    default Object getValue(Field field) {
        Object res = null;
        try {
            field.setAccessible(true);
            Object f = field.get(this);
            if (f != null) {
                //If the field in question is an array of any kind
                if (field.getType().isArray()) {
                    JsonArray arr = new JsonArray();
                    Class<?> componentType = field.getType().getComponentType();
                    //if the field is a primitive array
                    if (componentType.isPrimitive()) {
                        if (boolean.class.isAssignableFrom(componentType)) {
                            boolean[] sArr = (boolean[]) f;
                            for (boolean s : sArr) {
                                arr.add(s);
                            }
                        } else if (byte.class.isAssignableFrom(componentType)) {
                            byte[] sArr = (byte[]) f;
                            for (byte s : sArr) {
                                arr.add(s);
                            }
                        } else if (char.class.isAssignableFrom(componentType)) {
                            char[] cArr = (char[]) f;
                            for (char c : cArr) {
                                arr.add(c);
                            }
                        } else if (double.class.isAssignableFrom(componentType)) {
                            double[] sArr = (double[]) f;
                            for (double s : sArr) {
                                arr.add(s);
                            }
                        } else if (float.class.isAssignableFrom(componentType)) {
                            float[] sArr = (float[]) f;
                            for (float s : sArr) {
                                arr.add(s);
                            }
                        } else if (int.class.isAssignableFrom(componentType)) {
                            int[] sArr = (int[]) f;
                            for (int s : sArr) {
                                arr.add(s);
                            }
                        } else if (long.class.isAssignableFrom(componentType)) {
                            long[] sArr = (long[]) f;
                            for (long s : sArr) {
                                arr.add(s);
                            }
                        } else if (short.class.isAssignableFrom(componentType)) {
                            short[] sArr = (short[]) f;
                            for (short s : sArr) {
                                arr.add(s);
                            }
                        }
                    } else {
                        //If the field implements this interface, recurse and serialize all the sub fields
                        if (Exportable.class.isAssignableFrom(componentType)) {
                            Exportable[] eArr = (Exportable[]) f;
                            //Add square brackets if there is more than one element in the array
                            for (Exportable e: eArr) {
                                arr.add(e.serializeClass());
                            }
                        } else {
                            //if the field is an instance of a string array add the necessary quotes
                            if (((Object[]) f)[0] instanceof String) {
                                String[] sArr = (String[]) f;
                                for (String s : sArr) {
                                    arr.add(s);
                                }
                            } else {
                                Object[] sArr = (Object[]) f;
                                for (Object s : sArr) {
                                    arr.add(s.toString());
                                }
                            }
                        }
                    }
                    return arr;
                } ///END; is field an array
                //If the field is not an array and it implements this interface
                else if (f instanceof Exportable) {
                    //If the field also implements the DrosteSeperation interface, it should be separately serialized
                    if (f instanceof DrosteSeperation) {
                        //Get the placeholder of what should be serialized now
//                        String s = ((DrosteSeperation) f).deflateClass();
//                        if (s != null) {
//                            result.append(fieldName)
//                                    .append(": ")
//                                    .append(s);
//                        }
                    } else if (f instanceof HighchartsColorString) {
                        res = ((HighchartsColorString) f).getColor();
                    } else {
                        //recurse and serialize all the fields within the subclass
                        res = ((Exportable) f).serializeClass();
                    }
                    return res;
                } else {
                    //If this is not and array and does not implement this interface, serialize as normal
                     if (f instanceof Enum) {
                        res = f.toString().replace('_', '-');
                    } else {
                        res = f;
                    }
                     return res;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    /**
     * Override this method if using the annotation DelegateDeflate
     * @param field
     * @return
     */
    default Object getDelegatedValue(Field field) {
        return null;
    }


}
