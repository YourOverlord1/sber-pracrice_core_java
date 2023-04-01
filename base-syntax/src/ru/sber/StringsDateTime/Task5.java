package ru.sber.StringsDateTime;
import java.time.LocalDate;
import java.time.Period;

public class Task5 {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate birthDate = LocalDate.of(1995, 1, 15);

        int age = Period.between(birthDate, currentDate).getYears();

        System.out.println("Возраст: " + age + " лет");
    }
}