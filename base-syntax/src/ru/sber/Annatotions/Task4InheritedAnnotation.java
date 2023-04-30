package ru.sber.Annatotions;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface Task4InheritedAnnotation {
    int dayOfWeek() default 0;
    String description();
}
