package ru.sber.Annatotions;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;

@Repeatable(Task2Container.class)
@Target(ElementType.METHOD)

public @interface Task2 {
    int hours() default 0;
    int precedence() default 0;
    String specification() default "";
}