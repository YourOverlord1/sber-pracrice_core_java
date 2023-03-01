package ru.sber.ObjectOrientedProgramming;
import static java.lang.Math.PI;

public class Circle {
    double radius;
    String color;

    void area(int radius) {
        System.out.println("Площадь круга = " + PI * Math.pow(radius, 2));
    }

    void perimeter(int radius) {
        System.out.println("Периметр круга = " + 2 * PI * radius);
    }

    public Circle(double r, String col) {
        radius = r;
        color = col;
    }

    public Circle(){
    }

    void toString(double radius, String color) {
        System.out.println("radius " + radius);
        System.out.println("Color " + color);
        System.out.println("Area " + PI * Math.pow(radius, 2));
        System.out.println("perimeter " + 2 * PI * radius);
    }
}