package ru.sber.Annatotions;

import java.lang.annotation.Inherited;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
@Inherited
@Target(ElementType.TYPE)
public @interface Task1 {
    int dayOfWeek() default 0;
}