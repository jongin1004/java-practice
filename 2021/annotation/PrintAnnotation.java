package annotation;

import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {
	String value() default "-"; // ���м��� ���� ����
	int number() default 15; // �ݺ� ��� Ƚ��
}
