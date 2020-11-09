package hw_09_11_2020.hw_2;

import java.util.LinkedList;
import java.util.Queue;

public class Shop {


    public static void main(String[] args) {

        Cashbox cashbox = new Cashbox(new Buyer("Vasya", "milk, sugar"));
        Cashbox cashbox1 = new Cashbox(new Buyer("Tolik", "nuts, bread"));
        Cashbox cashbox2 = new Cashbox(new Buyer("John", "meat, bread"));
        Cashbox cashbox3 = new Cashbox(new Buyer("Lilya", " bread"));
        Cashbox cashbox4 = new Cashbox(new Buyer("Petya", "apples"));

        cashbox.start();
        cashbox1.start();

        try {
            cashbox.join();
            System.out.println("Waiting buyer...");
        } catch (InterruptedException e) {}

        cashbox2.start();
        cashbox3.start();

        try {
            cashbox3.join();
            System.out.println("Waiting buyer...");
        } catch (InterruptedException e) {}

        cashbox4.start();
    }
}
