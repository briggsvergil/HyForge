package za.co.onlineintelligence.hyforge.common.annotations;

import za.co.onlineintelligence.hyforge.common.CommonUtils.Delegator;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Used to mark a field that has custom properties for serialization.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Deflate {
    String serializeName();
}
