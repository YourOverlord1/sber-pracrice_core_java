package ru.sber.Collections;

import java.util.Scanner;
public class MainArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        System.out.println("Введите количество элементов");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Введите " + number + " Чисел");
        for(int i = 0; i < number; i++) {
            int numbers = scanner.nextInt();
            arrayList.add(numbers);
        }
        System.out.println("Размер list " + arrayList.size());
        System.out.println();

        System.out.println("Введите число, чтобы узнать на какой позиции оно встречено в первый и последний раз");
        number = scanner.nextInt();
        System.out.println("Первое раз встретилось на позиции " + arrayList.indexOf(number) +
                " Последний раз встретилось на позиции "
                + arrayList.lastIndexOf(number));
        System.out.println();

        System.out.println("Добавьте еще одно число");
        number = scanner.nextInt();
        arrayList.add(number);
        System.out.println("Размер list стал " + arrayList.size());
        System.out.println();

        System.out.println("Введите элемент, который хотите удалить");
        number = scanner.nextInt();
        arrayList.remove(number);
        System.out.println("Размер list стал " + arrayList.size());
        System.out.println();

        System.out.println("Введите число, чтобы проверить содержится ли оно в list");
        number = scanner.nextInt();
        System.out.println(arrayList.contains(number));
        System.out.println();


        int num = scanner.nextInt();
        System.out.println("Введите число, чтобы проверить содержится ли оно");
        number = scanner.nextInt();
        System.out.println(arrayList.contains(number));
        System.out.println();

        System.out.println("Создадим новый list на основе первого, введите позицию 'от' и 'до' ");
        num = scanner.nextInt();
        number = scanner.nextInt();
        arrayList.subList(num, number);
        System.out.println("Размер нового list " + arrayList.size());
        System.out.println();

        arrayList.clear();
        System.out.println("List почищен, его размер " + arrayList.size());
    }
}