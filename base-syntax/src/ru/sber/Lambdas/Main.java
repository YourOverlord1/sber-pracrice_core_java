package ru.sber.Lambdas;
import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        List<Sounding> list = new ArrayList<>();
        list.add(new Cat());
        list.add(new Dog());

        // Вызывать метод sound() у всех объектов в списке.
        list.forEach(Sounding::sound);

        // Добавить в список анонимный класс, выполнить пункт 4.
        list.add(new Sounding() {
            @Override
            public void sound() {
                System.out.println("tweet");
            }
        });
        list.forEach(Sounding::sound);

        // Добавить в список лямбда-функцию, выполнить пункт 4.
        list.add(() -> System.out.println("bark"));
        list.forEach(Sounding::sound);

        // Добавить в список ссылки на методы класса, НЕ реализующего интерфейс, выполнить пункт 4.
        list.add(Main::methodReference);
        list.forEach(Sounding::sound);

        // Переписать пункт 4 без явного использования циклов. Использовать метод forEach.
        list.forEach(Sounding::sound);
    }
    public static void methodReference() {
        System.out.println("quack");
    }
}
