package za.co.onlineintelligence.hyforge.common.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Meta-annotation to mark a field as a Data Transfer Object in order to serialize its fields as aggregate to the parent.
 *
 * @author Sean Briggs.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface DTODeflate {

}
