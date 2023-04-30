package ru.sber.Annatotions;

@Task4InheritedAnnotation(dayOfWeek = 3, description = "Переопределенная аннотация")
public class DescendantClass1 extends Task4Part2 {
    @RepeatedMethodAnnotation(hour = 12, priority = 2, description = "Метод 1")
    public void childMethod(Task2Container dataContainer) {
        System.out.println(dataContainer.getClass());
    }
}
