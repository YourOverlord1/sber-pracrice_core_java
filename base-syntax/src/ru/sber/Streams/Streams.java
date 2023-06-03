package ru.sber.Streams;
import java.util.*;
import java.util.stream.*;

public class Streams
{

    public static void main(String[] args) {

        // Задание 1
        List<Integer> numbers = new Random().ints(10, 0, 99).boxed().collect(Collectors.toList());
        System.out.println("До сортировки: " + numbers);
        List<Integer> twoDigitNumbers = numbers.stream().filter(x -> x > 9 && x < 100).sorted().collect(Collectors.toList());
        System.out.println("Двузначные числа: " + twoDigitNumbers);
        double average = numbers.stream().mapToDouble(Integer::doubleValue).average().orElse(0);
        System.out.println("Среднее значение: " + average);

        // Задание 3
        List<String> strings = Arrays.asList("one", "two", "three", "four", "five");
        List<StreamContainer> containers = strings.stream().map(x -> new StreamContainer(x, new Random().nextLong())).collect(Collectors.toList());
        containers.stream().forEach(System.out::println);
        Map<Long, String> map = containers.stream().collect(Collectors.toMap(StreamContainer::getCount, StreamContainer::getName));
        System.out.println(map);

        // Задание 4
        Map<String, List<StreamContainer>> myMap = new HashMap<>();
        myMap.put("one", Arrays.asList(new StreamContainer("one", 1), new StreamContainer("one", 2)));
        myMap.put("two", Arrays.asList(new StreamContainer("two", 3)));
        myMap.put("three", Arrays.asList(new StreamContainer("three", 4), new StreamContainer("three", 5), new StreamContainer("three", 6)));
        List<StreamContainer> flattenedList = myMap.values().stream().flatMap(List::stream).collect(Collectors.toList());
        long count = flattenedList.stream().count();
        System.out.println("Количество элементов: " + count);

        // Задание 5
        String binaryString = "1010101010";
        boolean result = Stream.of(binaryString.split("")).map(x -> x.equals("1")).reduce(true, (x, y) -> x && y);
        System.out.println("Результат через 'И': " + result);
    }
}