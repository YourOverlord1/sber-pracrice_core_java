package ru.sber.base.syntax;

public class Task6 {

    public static void main(String[] args) {
        String[][] matrix = {{"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*"}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
