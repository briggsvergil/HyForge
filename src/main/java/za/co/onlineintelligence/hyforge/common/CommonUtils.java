package za.co.onlineintelligence.hyforge.common;

import com.google.gson.JsonElement;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;

public class CommonUtils {

    @FunctionalInterface
    public interface StringSupplier {
        String get();
    }

    @FunctionalInterface
    public interface Delegator {
        Object delegate();
    }

    /**
     * Instance method to retrieve an array of field names where the fields are set, i.e. not null.
     *
     * @return
     */
    public static List<String> getSetFields(Object obj) {
        try {
            List<Field> fields = new ArrayList<>();
            fields = getAllFields(fields, obj.getClass());
            return fields.stream().filter(field -> {
                field.setAccessible(true);
                try {
                    return field.get(obj) != null;
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

    @SuppressWarnings("unchecked")
    private static <E> E getSingleInstanceType(Class<E> c, E e) throws IllegalAccessException, InstantiationException {
        if (c.isAssignableFrom(Integer.class) || c.isAssignableFrom(int.class)) e = (E) new Integer(-1000);
        else if (c.isAssignableFrom(Long.class) || c.isAssignableFrom(long.class)) e = (E) new Long(-1000L);
        else if (c.isAssignableFrom(Double.class) || c.isAssignableFrom(double.class)) e = (E) new Double(-1000.0d);
        else if (c.isAssignableFrom(Float.class) || c.isAssignableFrom(float.class)) e = (E) new Float(-1000.0f);
        else if (c.isAssignableFrom(Byte.class) || c.isAssignableFrom(byte.class)) e = (E) new Byte((byte) -64);
        else if (c.isAssignableFrom(Short.class) || c.isAssignableFrom(short.class)) e = (E) new Short((short) -128);
        else if (c.isAssignableFrom(Character.class) || c.isAssignableFrom(char.class)) e = (E) new Character((char) -1);
        else if (c.isAssignableFrom(Boolean.class) || c.isAssignableFrom(boolean.class)) e = (E) Boolean.FALSE;
        else if (c.isAssignableFrom(String.class)) e = (E) "";
        else if (c.isEnum()) e = c.getEnumConstants()[0];
        else e = c.newInstance();
        return e;
    }

    @SuppressWarnings("unchecked")
    private static <E> E getArrayInstanceType(Class<?> c, E e) throws IllegalAccessException, InstantiationException {
        if (c.isAssignableFrom(Integer.class)) {
            e = (E) new Integer[0];
        } else if (c.isAssignableFrom(int.class)) {
            e = (E) new int[0];
        } else if (c.isAssignableFrom(Long.class)) {
            e = (E) new Long[0];
        } else if (c.isAssignableFrom(long.class)) {
            e = (E) new long[0];
        } else if (c.isAssignableFrom(Double.class)) {
            e = (E) new Double[0];
        } else if (c.isAssignableFrom(double.class)) {
            e = (E) new double[0];
        } else if (c.isAssignableFrom(Float.class)) {
            e = (E) new Float[0];
        } else if (c.isAssignableFrom(float.class)) {
            e = (E) new float[0];
        } else if (c.isAssignableFrom(Byte.class)) {
            e = (E) new Byte[0];
        } else if (c.isAssignableFrom(byte.class)) {
            e = (E) new byte[0];
        } else if (c.isAssignableFrom(Short.class)) {
            e = (E) new Short[0];
        } else if (c.isAssignableFrom(short.class)) {
            e = (E) new short[0];
        } else if (c.isAssignableFrom(Character.class)) {
            e = (E) new Character[0];
        } else if (c.isAssignableFrom(char.class)) {
            e = (E) new char[0];
        } else if (c.isAssignableFrom(Boolean.class)) {
            e = (E) new Boolean[0];
        } else if (c.isAssignableFrom(boolean.class)) {
            e = (E) new boolean[0];
        } else if (c.isAssignableFrom(String.class)) {
            e = (E) new String[0];
        } else if (c.isEnum()) {
            e = (E) c.getEnumConstants();
        } else {
            Object o = Array.newInstance(c, 0);
            e = (E) o;
        }

        return e;
    }

    @SuppressWarnings("unchecked")
    public static <E> E getInstanceOf(Class<E> c, E e) {
        try {
            if (e == null) {
                if (c.isArray()) {
                    Class<?> cc = c.getComponentType();
                    e = getArrayInstanceType(cc, e);
                } else
                    e = getSingleInstanceType(c, e);
            }
        } catch (Exception ex) {
            //fail-safe
            e = null;
        }

        return e;
    }

    /**
     * Generically adds an element of type T to a regular array T[]
     *
     * @param c   The array collection to which an element should be added.
     * @param e   The element to add to the collection.
     * @param <T> The Type of the element and element array
     */
    public static <T> T[] addE(T[] c, T e) {
        T[] r;
        int len = c.length;
        r = Arrays.copyOf(c, len + 1);
        r[len] = e;
        return r;
    }

    /**
     * Use Java reflection to get all fields in a class and all fields in the superclass(es)
     *
     * @param fields A pointer to a field-list used for recursion
     * @return The full list of fields in class and superclass structure
     */
    public static List<Field> getAllFields(List<Field> fields, Class<?> clazz) {
        fields.addAll(Arrays.asList(clazz.getDeclaredFields()));

        if (clazz.getSuperclass() != null) {
            getAllFields(fields, clazz.getSuperclass());
        }

        return fields;
    }

    public static <T> Boolean isField(Field field, String fieldCompare, boolean isFieldNull) {
        return
                field.getName().equalsIgnoreCase(fieldCompare) ?
                        !isFieldNull ?
                                Boolean.TRUE
                                : null
                        : Boolean.FALSE;
    }

    private final static Set<Class<?>> NUMBER_REFLECTED_PRIMITIVES;

    static {
        Set<Class<?>> s = new HashSet<>();
        s.add(byte.class);
        s.add(short.class);
        s.add(int.class);
        s.add(long.class);
        s.add(float.class);
        s.add(double.class);
        NUMBER_REFLECTED_PRIMITIVES = s;
    }

    public static boolean isReflectedFieldANumber(Class<?> type) {
        return Number.class.isAssignableFrom(type) || NUMBER_REFLECTED_PRIMITIVES.contains(type);
    }
}
