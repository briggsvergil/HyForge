package za.co.onlineintelligence.hyforge.common;

public @interface Exporting {
    boolean readonly() default false;

    boolean featured();

    boolean required() default false;

    boolean disabled() default false;

    int minimum();

    String label();

    String hint();

    String placeholder();
}
