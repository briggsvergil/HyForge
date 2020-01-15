package za.co.onlineintelligence.hyforge.common;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class CommonUtils {

    @FunctionalInterface
    public interface StringSupplier {
        String get();
    }

    public static <E> E getInstanceOf(Class<E> c, E e) {
        if (e == null) {
            try {
                e = (E) c.newInstance();
            } catch (Exception ex) {
                e = null;
            }
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
}
