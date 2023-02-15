package ru.sber.base.syntax;

import java.util.Scanner;
public class Task8 {
    public static void main (String [] args) {
        String answer;
        boolean exit;
        System.out.println ("Что это такое: синий, большой, с усами и полностью набит зайцами?");
        Scanner Answers = new Scanner (System.in);
        exit = false;
        for(int i = 0; i < 3; i++){
            if (exit == true)
                break;
            answer = Answers.next();
            switch (answer){
                case ("Троллейбус"):
                    System.out.println ("Правильно!");
                    exit = true;
                    break;
                case ("Сдаюсь"):
                    System.out.println ("Правильный ответ: троллейбус");
                    exit = true;
                    break;
                default:
                    System.out.println("Подумай еще");
            }
        }
    }
}