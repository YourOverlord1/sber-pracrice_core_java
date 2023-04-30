package ru.sber.Annatotions;

@Task4InheritedAnnotation(dayOfWeek = 7, description = "")
public class Task4Part2 {
    @RepeatedMethodAnnotation(hour = 10, priority = 1, description = "Base method 1")
    public void parentMethod(Task2Container dataContainer) {
        System.out.println(dataContainer.getClass());
    }
}