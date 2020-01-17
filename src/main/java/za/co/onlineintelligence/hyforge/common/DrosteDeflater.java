package za.co.onlineintelligence.hyforge.common;

import com.google.common.base.CaseFormat;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import javax.annotation.Nullable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static za.co.onlineintelligence.hyforge.common.CommonUtils.*;
import static za.co.onlineintelligence.hyforge.common.CommonUtils.getAllFields;

/**
 * DrosteDeflater:
 * Recursive Reflection JSON Serializer
 * <p>
 * When inheriting from this interface, the default methods to serialize the inheriting classes fields can be called or
 * overridden for case-specific serializing, whether for a single field or for the entire field list in a class.
 * If any of the fields in the inheriting class are themselves of an instance of this interface, they too will be
 * subject to the serialization process, this will happen recursively until no more fields in the subclass structure
 * implement this interface.
 * <p>
 * Once serialization is complete, a JSON string will be returned with the structure of every field in the inheriting
 * class and it's subclasses inheriting from this interface, with the simple JSON dictionary form of: { KEY: VALUE }
 * KEY being the class field name verbatim.
 * Value being the set value for the key.
 * <p>
 * Provision has been made for Arrays of Primitives, Arrays of Objects, Arrays of Objects inheriting from this interface
 * i.e. Substructures, Strings, Enums.
 *
 * @author Sean Briggs
 * JAN 2020
 */
public interface DrosteDeflater {

    String RTS = "$RTS$";
    String QUOTE = "'";

    /**
     * Static method to return a string of tabs given a number of tabs to create.
     * <p>
     * Note: This is simplified in Java 11 by using "someString".repeat(int n);
     *
     * @param tabLevel
     * @return
     */
    static String getTabString(int tabLevel) {
        //Use stream to repeat tab for now, as String::repeat method has only been added from Java 11 onward
        String t = "  ";
        return IntStream.range(0, tabLevel).mapToObj(i -> t).collect(Collectors.joining());
    }

    /**
     * Instance method to retrieve an array of field names where the fields are set, i.e. not null.
     *
     * @return
     */
    default List<String> getSetFields() {
        try {
            List<Field> fields = new ArrayList<>();
            fields = getAllFields(fields, this.getClass());
            return fields.stream().filter(field -> {
                field.setAccessible(true);
                try {
                    return field.get(this) != null;
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                return false;
            }).map(Field::getName).collect(Collectors.toList());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    /**
     * The no-parameter overridden method of deflateFields(ignoreName, nameDelegate, tabLevel)
     * defaulting the parameters to true, empty string, and 1 respectively.
     *
     * @return
     */
    default String deflateFields() {
        return this.deflateFields(true, "", 1);
    }


    /**
     * This method will iterate reflectively over an inheriting class's fields and serialize the content of set fields,
     * returning a JSON string.
     * <p>
     * NOTE: Override this method when serialization for the entire inheriting class's fields needs to be different.
     *
     * @param ignoreName   This flag is used to un-mark the serialization of the JSON KEY/fieldName in the structure.
     * @param nameDelegate This is the override fieldName/JSON KEY parameter, setting this to an empty string will
     *                     result in no key value in JSON.
     * @param tabLevel     This is the number of whitespace tabs to create before Key-Value pairs.
     * @return
     */
    default String deflateFields(boolean ignoreName, String nameDelegate, int tabLevel) {

        StringBuilder result = new StringBuilder();
        String newLine = "";
//        String newLine = System.getProperty("line.separator");
//        String tab = getTabString(tabLevel);
        String tab = "";
        if (nameDelegate != null) {
            String fieldType = ignoreName ?
                    nameDelegate +
                            (nameDelegate.length() > 0 ? ": " : "")
                    : this.getClass().getSimpleName().toLowerCase() + ": ";
//            if(fieldType.length() > 0) fieldType = "\"" + fieldType + "\"";
            result.append(fieldType)
                    .append("{")
                    .append(newLine);
        }

        //Get all fields from (this) and (super) recursively
        List<Field> fields = new ArrayList<>();
        fields = getAllFields(fields, this.getClass());

        //print field names paired with their values
        for (Field field : fields) {
            String sField = this.deflateField(field, tabLevel);
            result.append(sField != null ? sField : "");
        }

        if (nameDelegate != null) {
            //Remove trailing comma, but not if there is one within quotes.
            boolean withinString = false;
            int i;
            int j = result.length();
            int k;
            do {
                i = result.substring(0, j).lastIndexOf(",");
                k = result.lastIndexOf(QUOTE);
                j = k > 0 ? result.substring(0, k).lastIndexOf(QUOTE) : -1;
                withinString = (i > 0) && (i > j) && (i < k);
            } while (withinString);

            if (i > 0) {
                result.deleteCharAt(i);
            }
        }
//        result.append(tab, 0, tab.length() - 2);
        result.append(nameDelegate != null ? "}" : "");

        return result.toString();
    }

    /**
     * This method does the individual serialization of each field in the inheriting class.
     * <p>
     * NOTE: Override this method when serialization needs to occur differently for single/specific fields.
     *
     * @param field    A tuple of The field currently being serialized and the owner class,
     *                 in most cases the owner will be simply (this), otherwise it will be the superclass(es)
     * @param tabLevel This is the number of whitespace tabs to create before Key-Value pairs.
     * @return the serialization of the field as a string
     */
    default String deflateField(Field field, int tabLevel) {
        StringBuilder result = new StringBuilder();
        String newLine = "";
//        String newLine = System.getProperty("line.separator");
//        String tab = getTabString(tabLevel);
        String tab = "";
        String fieldName = QUOTE + field.getName().replace('_', '-') + QUOTE;
        try {
            //requires access to private field:
            field.setAccessible(true);
            Object f = field.get(this);
            if (f != null) {
                result.append(tab);

                //If the field in question is an array of any kind
                if (field.getType().isArray()) {
                    result.append(fieldName);
                    result.append(": ");
                    Class<?> componentType = field.getType().getComponentType();
                    //if the field is a primitive array
                    if (componentType.isPrimitive()) {
                        String arr = null;
                        if (boolean.class.isAssignableFrom(componentType)) {
                            arr = Arrays.toString((boolean[]) f);
                        } else if (byte.class.isAssignableFrom(componentType)) {
                            arr = Arrays.toString((byte[]) f);
                        } else if (char.class.isAssignableFrom(componentType)) {
                            arr = Arrays.toString((char[]) f);
                        } else if (double.class.isAssignableFrom(componentType)) {
                            arr = Arrays.toString((double[]) f);
                        } else if (float.class.isAssignableFrom(componentType)) {
                            arr = Arrays.toString((float[]) f);
                        } else if (int.class.isAssignableFrom(componentType)) {
                            arr = Arrays.toString((int[]) f);
                        } else if (long.class.isAssignableFrom(componentType)) {
                            arr = Arrays.toString((long[]) f);
                        } else if (short.class.isAssignableFrom(componentType)) {
                            arr = Arrays.toString((short[]) f);
                        }
                        result.append(arr == null ? "[]" : arr);
                    } else {
                        //If the field implements this interface, recurse and serialize all the sub fields
                        if (DrosteDeflater.class.isAssignableFrom(componentType)) {
                            DrosteDeflater[] arr = (DrosteDeflater[]) f;
                            //Add square brackets if there is more than one element in the array
                            result.append(arr.length < 2 ? "" : "[")
                                    .append(Arrays.stream(arr)
                                            .filter(Objects::nonNull)
                                            .map(ff -> ff.deflateFields(true, "", tabLevel + 1))
                                            .filter(Objects::nonNull)
                                            .collect(Collectors.joining(", ")))
                                    .append(arr.length < 2 ? "" : "]");
                        } else {
                            //if the field is an instance of a string array add the necessary quotes
                            if (((Object[]) f)[0] instanceof String) {
                                String[] arr = (String[]) f;
                                //Add square brackets if there is more than one element in the array
                                result.append(arr.length < 2 ? "" : "[")
                                        .append(Arrays.stream((String[]) f)
                                                .filter(Objects::nonNull)
                                                .map(s -> QUOTE + s + QUOTE)
                                                .collect(Collectors.joining(", ")))
                                        .append(arr.length < 2 ? "" : "]");
                            } else {
                                result.append(Arrays.deepToString((Object[]) f));
                            }
                        }
                    }

                } ///END; is field an array
                //If the field is not an array and it implements this interface
                else if (f instanceof DrosteDeflater) {
                    //If the field also implements the DrosteSeperation interface, it should be separately serialized
                    if (f instanceof DrosteSeperation) {
                        //Get the placeholder of what should be serialized now
                        String s = ((DrosteSeperation) f).deflateClass();
                        if (s != null) {
                            result.append(fieldName)
                                    .append(": ")
                                    .append(s);
                        }
                    } else if (f instanceof HighchartsColorString) {
                        result.append(fieldName)
                                .append(": ").append(QUOTE)
                                .append(((HighchartsColorString) f).getColor())
                                .append(QUOTE);
                    } else {
                        //recurse and serialize all the fields within the subclass
                        result.append(((DrosteDeflater) f).deflateFields(true, fieldName, tabLevel + 1));
                    }
                } else {
                    //If this is not and array and does not implement this interface, serialize as normal
                    result.append(fieldName);
                    result.append(": ");
                    //if the field is a string or an enum, surround value with single quotes.
                    if (field.getType() == String.class) {
                        result.append(QUOTE).append(f).append(QUOTE);
                    } else if (f instanceof Enum) {
                        result.append(QUOTE).append(f.toString().replace('_', '-')).append(QUOTE);
                    } else {
                        result.append(f);
                    }
                }
                result.append(",").append(newLine);
            }
        } catch (IllegalAccessException ex) {
            result.append("\n\nILLEGAL ACCESS EXCEPTION: [").append(ex).append("]\n");
        } catch (Exception e) {
            result.append("\n\nEXCEPTION: [").append(e).append("]\n");
            result.append("STACK TRACE: [\n");
            for (StackTraceElement ste : e.getStackTrace()) {
                result.append(ste).append("\n");
            }
            result.append("]\n");

        }
        return result.toString();
    }

    /**
     * This method is used to specify alternative logic in serializing specific fields
     * Use: delegateFieldDeflation(field, tabLevel, {literalFieldName}, {field}==null,
     * { () -> alternative logic});
     * <p>
     * Note: Special return value for overriding methods: "$RTS$", when encountered call
     * DrosteDeflater.super.deflateField(field, tabLevel)
     *
     * @param field        the field to be serialized
     * @param fieldCompare the literal field name to check for to delegate alternative logic
     * @param isFieldNull  a flag to state if the field is null
     * @param supplier     the delegating logic to resort to if the conditions match
     * @return the serialized field
     */
    default String delegateFieldDeflation(Field field, String fieldCompare,
                                          boolean isFieldNull, StringSupplier supplier) {
        Boolean b = isField(field, fieldCompare, isFieldNull);
        return b != null ? b ? supplier.get()
                : RTS
                : null;
    }

    static JsonElement deIonize(Class<?> clazz, @Nullable String title) {

        /**
         * Vue-Forms-Generator JSON structure:
         *
         * {
         *      model: {*field names and initial values*},
         *      schema: {fields[{*field1Opts*}, {*field2Opts*},...]},
         *      formOptions: {*formOptions*}
         *
         *      *Field Options:
         *      -type: string
         *      -inputType: string
         *      -label: string
         *      -model: string - reference to field listed in model
         *      -readonly: bool
         *      -disabled: bool
         *      -featured: bool
         *      -required: bool
         *      -placeholder: String
         *      -min: number
         *      -hint: string
         *      -*validator: ...
         *      -values: array of strings for enum
         *      -default: dependent on type
         * }
         */

        List<Field> fieldList = new ArrayList<>();
        fieldList = getAllFields(fieldList, clazz);

        JsonObject vueObj = new JsonObject();
        JsonObject modelObj = new JsonObject();
        JsonObject schemaObj = new JsonObject();
        JsonArray fieldsArray = new JsonArray();
//        if (title != null && !title.isEmpty()) vueObj.addProperty("title", title);

        for (Field f : fieldList) {
            f.setAccessible(true);

            JsonObject fieldObj = new JsonObject();
            String displayLabel = CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, f.getName()).replace('_', ' ');
            Class<?> type = f.getType();
            Class<?> componentType = type.getComponentType();
//            System.out.println("Field: " + f.getName() + ", Type: " + type + ", ComponentType: " + (componentType!=null? componentType : "N/A"));

            String inputString = "input";
            String typeString = "";
            String inputType = "text";
            boolean readonly = false;
            Boolean featured = null;
            Boolean required = null;
            Boolean disabled = null;
            Integer min = null;
            String hint = null;
            String placeholder = null;

            /*Object o = null;
            try {
                o = f.get(clazz);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }*/
            Annotation[] annotations = f.getAnnotations();
            final Exporting[] exportAnnotation = {null};
            Arrays.stream(annotations)
                    .filter(annotation -> annotation instanceof Exporting)
                    .map(annotation -> exportAnnotation[0] = (Exporting) annotation);

            if (exportAnnotation[0] != null) {
                disabled = exportAnnotation[0].disabled();
                readonly = exportAnnotation[0].readonly();
                required = exportAnnotation[0].required();
                featured = exportAnnotation[0].featured();
                String label = exportAnnotation[0].label();
                displayLabel = label.isEmpty() ? displayLabel : label;
                hint = exportAnnotation[0].hint();
                hint = hint.isEmpty() ? null : hint;
                min = exportAnnotation[0].minimum();
                placeholder = exportAnnotation[0].placeholder();
            }

            modelObj.addProperty(f.getName(), "");
            //sub structure
            //TODO: make allowances for enum (inputstring = checklist)
            if (type.isAssignableFrom(DrosteDeflater.class) || DrosteDeflater.class.isAssignableFrom(type)) {
                //TODO: build separate structure for these...
            } else if (type.isArray()) {
                typeString = "N/A";
            } else if (isReflectedFieldANumber(type)) {
                typeString = "number";
            } else if (boolean.class.isAssignableFrom(type) || Boolean.class.isAssignableFrom(type)) {
                typeString = "boolean";
            } else if (type.isEnum()) {
                typeString = "enum";
            } else {
                typeString = "string";
            }

            if (typeString.equals("boolean")) {
                inputType = "checkbox";
            } else if (typeString.equals("number")) {
                inputType = "number";
            } else if (typeString.equals("enum")) {
                inputString = "checklist";
                inputType = null;
            }

            fieldObj.addProperty("type", inputString);
            if (inputType != null) fieldObj.addProperty("inputType", inputType);
            fieldObj.addProperty("label", displayLabel);
            fieldObj.addProperty("model", f.getName());
            fieldObj.addProperty("readonly", readonly);

            if (inputString.equals("checklist")) {
                JsonArray arr = new JsonArray();
                for (Object o : type.getEnumConstants()) {
                    arr.add(o.toString());
                }
                fieldObj.add("values", arr);
            }

            if (featured != null) fieldObj.addProperty("featured", featured);
            if (required != null) fieldObj.addProperty("required", required);
            if (disabled != null) fieldObj.addProperty("disabled", disabled);
            if (hint != null) fieldObj.addProperty("hint", hint);
            if (min != null && min != 0) fieldObj.addProperty("min", min);
            if (placeholder != null) fieldObj.addProperty("placeholder", placeholder);

            fieldsArray.add(fieldObj);
        }

        vueObj.add("model", modelObj);
        schemaObj.add("fields", fieldsArray);
        vueObj.add("schema", schemaObj);

        return vueObj;
    }
}
