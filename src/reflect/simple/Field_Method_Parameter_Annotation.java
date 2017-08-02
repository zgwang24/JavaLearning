package reflect.simple;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target({ PARAMETER, METHOD, FIELD })
public @interface Field_Method_Parameter_Annotation {
	String describe();
	Class type() default void.class;
}
