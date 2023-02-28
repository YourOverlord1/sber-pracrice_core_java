package ObjectOrientedProgramming;
import java.util.Scanner;

public class PizzaOrder {
    private String name, adress;
    private String Enum;
    private Boolean sauce, complete = false;

    public PizzaOrder(String name, String adress, String Enum, Boolean sause) {
        this.name = name;
        this.adress = adress;
        this.Enum = Enum;
        this.sauce = sause;
    }
    enum Size{
        SMALL,
        MEDIUM,
        BIG
    }

    public PizzaOrder() {
    }

    public void order() {
        if (!this.complete) {
            if (sauce) {
                System.out.println("Заказ принят " + this.Enum + " Пицца " + this.name + " по адресу " + this.adress + " c соусом ");
                this.complete = true;
            }
            if (!sauce) {
                System.out.println("Заказ принят " + this.Enum + " Пицца " + this.name + " по адресу " + this.adress + " без соуса ");
                this.complete = true;
            }
        } else {
            System.out.println("Заказ уже принят");
        }
    }

    public void cancel() {
        System.out.println("Заказ отменен");
        this.complete = false;
    }

    public String toString() {
        return "Название пиццы " + this.name + ", "
                + " адрес : " + this.adress + ","
                + " Размер : " + this.Enum + ","
                + " нужен ли соус " + this.sauce + ","
                + " Принят ли  : " + this.complete;
    }

    static int getNum() {
        Scanner num = new Scanner(System.in);
        return num.nextInt();
    }

    static String getStr() {
        Scanner str = new Scanner(System.in);
        return str.nextLine();
    }
    public static void main(String[] args) {
        String name, adres;
        String Enum;
        Boolean soys;
        int a;
        System.out.println("Название пиццы");
        name = getStr();
        System.out.println("Адрес");
        adres = getStr();
        System.out.println("Размер");
        Enum = getStr();
        System.out.println("Наличие соуса 1-да 2 нет");
        a = getNum();
        if (a==1){soys = true;}else{soys = false;}
        PizzaOrder Pi = new PizzaOrder(name, adres, Enum, soys);
        Pi.order();
        Pi.order();
        Pi.cancel();
        System.out.println(Pi);
    }
}