package ru.sber.base.syntax;

public class Task7 {
    public static void main(String[] args) {
        int f1 = 1;
        int f2 = 1;
        int f3;
        System.out.print(f1 + " " + f2 + "");

        for (int a = 3; a <= 11; a++){
            f3 = f1 +f2;
            System.out.print(f3 + " ");
            f1 = f2;
            f2 = f3;
        }
    }
}