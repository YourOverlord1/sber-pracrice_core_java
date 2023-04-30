package ru.sber.Annatotions;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
public @interface RepeatedMethodAnnotation {
    int hour();
    int priority() default 0;
    String description() default "";
    boolean nullable() default true;
}
