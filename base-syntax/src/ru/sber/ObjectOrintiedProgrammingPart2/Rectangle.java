package ru.sber.ObjectOrintiedProgrammingPart2;

public class Rectangle extends Figure implements Drawable {
    public Rectangle(){
        Point.x=1;
        Point.y=1;
        Point.y1=2;
        Point.x1=4;
    }
    public double area(){
        double sq = (Point.x1-Point.x)*(Point.y1-Point.y);
        return sq;
    }

    public double perimeter(){
        int pe =  2*((Point.x1-Point.x)+(Point.y1-Point.y));
        return pe;
    }

    public String draw(){
        String s1 = (" Прямоугольник c координатами " + Point.x+ " по x1 и " + Point.y + " по y1 " +  Point.x1 + " по x2 и " + Point.y1 + " по y2");
        return s1;
    }

    public String draw(Color color){
        String s2 = " ";
        if (color == Color.Yellow) {
            s2 = " Жёлтый прямоугольник с кодинатами " + Point.x + " по x1 и " + Point.y + " По y1 " +  Point.x1 + " по x2 и " + Point.y1 + " по y2";
        }else if (color == Color.Green){
            s2 = " Зеленый прямоугольник с кодинатами " + Point.x + " по x1 и " + Point.y + " По y1 " +  Point.x1 + " по x2 и " + Point.y1 + " по y2";
        }else if (color == Color.Blue){
            s2 = " Голубой прямоугольник с кодинатами " + Point.x + " по x1 и " + Point.y + " По y1 " +  Point.x1 + " по x2 и " + Point.y1 + " по y2";
        }else if (color == Color.Red){
            s2 = " Красный прямоугольник с кодинатами " + Point.x + " по x1 и " + Point.y + " По y1 " +  Point.x1 + " по x2 и " + Point.y1 + " по y2";
        }else if (color == Color.White){
            s2 = " Белый прямоугольник с кодинатами " + Point.x + " по х1 " + Point.y + " По y1 " +  Point.x1 + " по x2 и " + Point.y1 + " по y2";
        }
        return s2;
    }
}
