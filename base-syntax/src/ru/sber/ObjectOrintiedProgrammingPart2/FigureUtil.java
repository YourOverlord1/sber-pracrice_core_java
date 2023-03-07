package ru.sber.ObjectOrintiedProgrammingPart2;

public class FigureUtil {
    private FigureUtil(){
    }

    public static double area(Figure figure){
        double sq = figure.area();
        return sq;
    }
    public static double perimeter(Figure figure){
        double pe = figure.perimeter();
        return pe;
    }

    public static void draw(Drawable figure){
        String s1 = figure.draw();
        System.out.println("Нарисован " + s1);
    }

    public static void draw(Drawable figure, Figure.Color color) {
        String s2 = figure.draw(color);
        System.out.println("Нарисован " + s2);
    }
}
