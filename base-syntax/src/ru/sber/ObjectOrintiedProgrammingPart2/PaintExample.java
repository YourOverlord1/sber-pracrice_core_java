package ru.sber.ObjectOrintiedProgrammingPart2;

public class PaintExample {
    public static void main(String[] args){
        Circle ci = new Circle();
        System.out.println(FigureUtil.area(ci));
        System.out.println(FigureUtil.perimeter(ci));
        FigureUtil.draw(ci);
        FigureUtil.draw(ci, Figure.Color.Green);
        System.out.println();

        Rectangle re = new Rectangle();
        System.out.println(FigureUtil.area(re));
        System.out.println(FigureUtil.perimeter(re));
        FigureUtil.draw(re);
        FigureUtil.draw(re, Figure.Color.Red);
        System.out.println();

        Square sq = new Square();
        System.out.println(FigureUtil.area(sq));
        System.out.println(FigureUtil.perimeter(sq));
        FigureUtil.draw(sq);
        FigureUtil.draw(sq, Figure.Color.Blue);
        System.out.println();

        Triangle tr = new Triangle();
        System.out.println(FigureUtil.area(tr));
        System.out.println(FigureUtil.perimeter(tr));
        FigureUtil.draw(tr);
        FigureUtil.draw(tr, Figure.Color.Yellow);
    }
}
