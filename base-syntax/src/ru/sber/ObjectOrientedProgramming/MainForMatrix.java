package ru.sber.ObjectOrientedProgramming;

import java.util.Scanner;

public class MainForMatrix {
    public static void main(String[] args) {
        Matrix Ma = new Matrix();
        System.out.println("Введите колечетсво столбцов");
        Ma.str = getNum();
        System.out.println("Введите колечетсво строк");
        Ma.sto = getNum();
        System.out.println("Введите матрицу");
        for (int i = 0; i < Ma.str; i++) {
            for (int j = 0; j < Ma.sto; j++) {
                Ma.value[i][j] = getNum();
            }
        }
        System.out.println("Матрица выглядит:");
        Ma.writeMatrix(Ma.str, Ma.sto, Ma.value);
        System.out.println();

        System.out.println("Матрица умноженная на 2 выглядит:");
        Ma.umnMatr(Ma.str, Ma.sto, Ma.value, 2);
        System.out.println();

        System.out.println("Элемент 2 и 2 выглядит:");
        Ma.setVallue(2, 2, Ma.value);
        System.out.println();

        Matrix Ma1 = new Matrix();
        System.out.println("Введите колечетсво столбцов");
        Ma1.str = getNum();
        System.out.println("Введите колечетсво строк");
        Ma1.sto = getNum();
        System.out.println("Введите матрицу");
        for (int i = 0; i < Ma1.str; i++) {
            for (int j = 0; j < Ma1.sto; j++) {
                Ma1.value[i][j] = getNum();
            }
        }
        System.out.println("Перемножение матриц выглядит:");
        Ma.umnMatrix(Ma.str, Ma.sto, Ma.value, Ma1.value);
        System.out.println();

        System.out.println("Сумма матриц выглядит:");
        Ma.sumMatr(Ma.str, Ma.sto, Ma.value, Ma1.value);
        System.out.println();
    }

    static int getNum() {
        Scanner num = new Scanner(System.in);
        return num.nextInt();
    }
}