package ru.sber.ObjectOrintiedProgrammingPart2;

public class Triangle extends Figure implements Drawable {
    public Triangle(){
        Point.x=0;
        Point.y=0;
        Point.y1=2;
        Point.x1=0;
        Point.x2=2;
        Point.y2=0;
    }
    public double area(){
        double sq = (Point.x2-Point.x1)*(Point.y1-Point.y);
        return sq;
    }

    public double perimeter(){
        double pe = (Point.x2-Point.x1)*(Point.y1-Point.y)*Math.pow(Math.pow((Point.x-Point.x2),2)+Math.pow((Point.y-Point.y2),2),1/2);
        return pe;
    }

    public String draw(){
        String s1 = ("Треугольник c координатами " + Point.x + " по x1 и " + Point.y + " по y1 " +  Point.x1 + " по x2 и " + Point.y1 + " по y2 " +  Point.x2 + " по x3 и " + Point.y2 + " по y3");
        return s1;
    }

    public String draw(Color color){
        String s2 = " ";
        if (color == Color.Yellow) {
            s2 = "Жёлтый тругольник с кодинатами " + Point.x + " по x и " + Point.y + " По y " +  Point.x1 + " по x2 и " + Point.y1 + " по y2 " +  Point.x2 + " по x3 и " + Point.y2 + " по y3";
        }else if (color == Color.Green){
            s2 = "Зеленый тругольник с кодинатами " + Point.x + "  по x1 и " + Point.y + " По y1 " +  Point.x1 + " по x2 и " + Point.y1 + " по y2 " +  Point.x2 + " по x3 и " + Point.y2 + " по y3";
        }else if (color == Color.Blue){
            s2 = "Голубой тругольник с кодинатами " + Point.x + "  по x1 и " + Point.y + " По y1 " +  Point.x1 + " по x2 и " + Point.y1 + " по y2 " +  Point.x2 + " по x3 и " + Point.y2 + " по y3";
        }else if (color == Color.Red){
            s2 = "Красный тругольник с кодинатами " + Point.x + " по x1 и " + Point.y + " По y1 " +  Point.x1 + " по x2 и " + Point.y1 + " по y2 " +  Point.x2 + " по x3 и " + Point.y2 + " по y3";
        }else if (color == Color.White){
            s2 = "Белый тругольник с кодинатами " + Point.x + " по х1 " + Point.y + " По y1 " +  Point.x1 + " по x2 и " + Point.y1 + " по y2 " +  Point.x2 + " по x3 и " + Point.y2 + " по y3";
        }
        return s2;
    }
}
