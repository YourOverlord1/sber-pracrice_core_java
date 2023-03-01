package ru.sber.ObjectOrientedProgramming;

public class MainForCircle {
    public static void main (String[] args) {
        Circle square = new Circle();
        Circle perimeter1 = new Circle();
        Circle circle1 = new Circle(4, "red");

        square.area(4);
        perimeter1.perimeter(4);
        circle1.toString(4, "red");
    }
}
