package Class;

import java.lang.annotation.*;

//import com.sun.tools.javac.code.Attribute.RetentionPolicy;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {
	String value() default "-";
	int number() default 15;
}
