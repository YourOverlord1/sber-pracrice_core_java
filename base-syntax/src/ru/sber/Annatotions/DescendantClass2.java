package ru.sber.Annatotions;

public class DescendantClass2 extends Task4Part2{
    @RepeatedMethodAnnotation(hour = 15, priority = 3, description = "Без аннатации метод 1")
    public void childWithoutAnnotationMethod(Task2Container dataContainer) {
        System.out.println(dataContainer.getClass());
    }

}
