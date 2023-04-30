package ru.sber.Annatotions;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
public @interface Task2Container {
    Task2[] value();
}
