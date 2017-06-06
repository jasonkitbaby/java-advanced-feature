package annotation;


import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.CLASS)
@Documented
@Inherited
public @interface MyAnnotation {
     String column() default "";
     String dataFormate() default "String";

}
