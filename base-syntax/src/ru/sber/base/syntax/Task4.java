package ru.sber.base.syntax;

public class Task4 {
    public static void main(String[] args) {
        int n = 10;
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }

        double max = array[0];
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
            if(max < array[i])
                max = array[i];
            avg += array[i]/array.length;
        }
        System.out.println("max = " + max);
        System.out.println("avg = " + avg);
    }
}