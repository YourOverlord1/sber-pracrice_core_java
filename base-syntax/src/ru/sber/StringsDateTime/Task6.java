package ru.sber.StringsDateTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task6 {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2019, 2, 1);
        LocalDate endDate = LocalDate.of(2019, 2, 20);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        LocalDate currentDate = startDate;
        while (!currentDate.isAfter(endDate)) {
            System.out.println(currentDate.format(formatter));
            currentDate = currentDate.plusDays(1);
        }
    }
}