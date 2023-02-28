package ObjectOrientedProgramming;
import javax.swing.text.Style;
import java.util.Scanner;
public class Matrix {
    int str, sto;
    int[][] value = new int[10][10];

    public void setVallue(int i, int j, int[][] value) {
        System.out.println(value[i - 1][j - 1]);
    }

    public static void sumMatr(int row, int cow, int[][] value, int[][] value1) {
        int[][] res = new int[row][cow];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cow; j++) {
                res[i][j] = value[i][j] + value1[i][j];
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cow; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void umnMatr(int row, int cow, int[][] value, int c) {
        int[][] res = new int[row][cow];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cow; j++) {
                res[i][j] = value[i][j] * c;
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cow; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void writeMatrix(int row, int cow, int[][] value) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cow; j++) {
                System.out.print(value[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void umnMatrix(int row, int cow, int[][] value, int[][] value1) {
        int[][] res = new int[row][cow];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cow; j++) {
                res[i][j] = value[i][j] * value1[j][i];
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cow; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}

