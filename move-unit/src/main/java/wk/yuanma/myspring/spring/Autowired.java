package wk.yuanma.myspring.spring;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target({ElementType.FIELD,ElementType.METHOD})
public @interface Autowired {

    String value() default "";
}
