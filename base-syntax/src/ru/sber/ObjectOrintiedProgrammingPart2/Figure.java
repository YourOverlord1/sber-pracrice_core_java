package ru.sber.ObjectOrintiedProgrammingPart2;

public abstract class Figure {
    public abstract double area();
    public abstract double perimeter();

    public enum Color{
        Red,
        Green,
        Yellow,
        Blue,
        White
    }
}

