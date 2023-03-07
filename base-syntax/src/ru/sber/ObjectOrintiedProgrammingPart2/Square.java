package ru.sber.ObjectOrintiedProgrammingPart2;

public class Square extends Figure  implements Drawable  {
    public Square(){
        Point.x=1;
        Point.y=1;
        Point.y1=4;
        Point.x1=4;
    }

    public double area(){
        double sq = (Point.x1-Point.x)*(Point.y1-Point.y);
        return sq;
    }

    public double perimeter(){
        double pe = 4*(Point.x1-Point.x);
        return pe;
    }

    public String draw(){
        String s1 = ("квадрат c координатами " + Point.x+ " по x и " + Point.y + " по y " + Point.x2+ " по x2 и " + Point.y2 + " по y2");
        return s1;
    }

    public String draw(Color color){
        String s2 = " ";
        if (color == Color.Yellow) {
            s2 = "Жёлтый квадрат с кодинатами " + Point.x + " по x1 и " + Point.y + " По y1 " +  Point.x1 + " по x2 и " + Point.y1 + " по y2";
        }else if (color == Color.Green){
            s2 = "Зеленый квадрат с кодинатами " + Point.x + "  по x1 и " + Point.y + " По y1 " +  Point.x1 + " по x2 и " + Point.y1 + " по y2";
        }else if (color == Color.Blue){
            s2 = "Голубой квадрат с кодинатами " + Point.x + "  по x1 и " + Point.y + " По y1 " +  Point.x1 + " по x2 и " + Point.y1 + " по y2";
        }else if (color == Color.Red){
            s2 = "Красный квадрат с кодинатами " + Point.x + " по x1 и " + Point.y + " По y1 " +  Point.x1 + " по x2 и " + Point.y1 + " по y2";
        }else if (color == Color.White){
            s2 = "Белый квадрат с кодинатами " + Point.x + " по х1 " + Point.y + " По y1 " +  Point.x1 + " по x2 и " + Point.y1 + " по y2";
        }
        return s2;
    }

}
