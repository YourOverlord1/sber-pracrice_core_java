package ObjectOrientedProgramming;

public class MainForPhone {
    public static void main (String[] args){
        Phone phone1 = new Phone("911", "Samsung");
        Phone phone2 = new Phone();
        phone1.receiveCall("Sergey");
        phone1.receiveCall("Gordey ", "79114734731");

        phone1.sendMessage( "Hello How are u?", "74837483");

        phone2.toString("899898898 ", "Apple ", 7.8);
    }
}
