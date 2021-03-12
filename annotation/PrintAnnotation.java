package annotation;

import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {
	String value() default "-"; // 구분선에 사용될 문자
	int number() default 15; // 반복 출력 횟수
}
