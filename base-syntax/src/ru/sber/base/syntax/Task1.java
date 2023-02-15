package ru.sber.base.syntax;

public class Task1 {
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    int temp = array [j];
                    array [j] = array [j + 1];
                    array [j + 1] = temp;
                }
            }
        }
    }
    public static void main(String args[]) {
        int[] array = {8, 6, 4, 1, 10, 9, 3, 2, 7, 5};
        bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}