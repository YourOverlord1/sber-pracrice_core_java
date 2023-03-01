package ru.sber.ObjectOrientedProgramming;

public class Phone {
    String number;
    String model;
    double weight;

    public Phone(String n, String m, double w){
        this.number = n;
        this.model = m;
        this.weight = w;
    }
    public Phone(String n, String m){
        this.number = n;
        this.model = m;
    }
    public Phone(){
    }

    void receiveCall(String name){
        System.out.println("Звонит " + name);
    }

    void receiveCall(String name, String number){
        System.out.println("Звонит " + name + "с номера " + number);
    }

    String getNumber(){
        return number;
    }
    void sendMessage(String message, String number){
        System.out.println("Сообщение " + message + " отправлено: " + number);
    }
    void toString(String number, String model, double weight){
        System.out.println("Number " + number);
        System.out.println("Model " + model);
        System.out.println("weight " + weight);
    }
}
