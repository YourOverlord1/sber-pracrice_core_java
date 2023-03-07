package ru.sber.ObjectOrintiedProgrammingPart2;

public class Circle extends Figure implements Drawable  {
    public Circle(){
        Point.x = 1;
        Point.y = 2;
        Point.r = 2;
    }
    public double area(){
        double sq = 3.14*Point.r*Point.r;
        return sq;
    }

    public double perimeter(){
        double pe = 2*3.14*Point.r;
        return pe;
    }

    public String draw(){
        String s1 = (" круг c координатами " + Point.x + " по x и " + Point.y + " по y" + " Радиуса " + Point.r );
        return s1;
    }

    public String draw(Color color){
        String s2 = " ";
        if (color == Color.Yellow) {
            s2 = "Жёлтый круг с кодинатами " + Point.x + " по x и " + Point.y + " По y " + " Радиуса " + Point.r ;
        }else if (color == Color.Green){
            s2 = "Зеленый круг с кодинатами " + Point.x + "  по x и " + Point.y + " По y " + " Радиуса " + Point.r ;
        }else if (color == Color.Blue){
            s2 = "Голубой круг с кодинатами " + Point.x + "  по x и " + Point.y + " По y " + " Радиуса " + Point.r ;
        }else if (color == Color.Red){
            s2 = "Красный круг с кодинатами " + Point.x + " по x и " + Point.y + " По y " + " Радиуса " + Point.r ;
        }else if (color == Color.White){
            s2 = "Белый круг с кодинатами " + Point.x + " по х " + Point.y + " По y " + " Радиуса " + Point.r ;
        }
        return s2;
    }


}