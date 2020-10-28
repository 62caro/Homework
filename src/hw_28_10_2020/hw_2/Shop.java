package hw_28_10_2020.hw_2;

import java.util.LinkedList;
import java.util.Queue;

public class Shop {

    public static void main(String[] args) {
        Queue<String> buyers = new LinkedList<>();

        buyers.add(new Buyer("Vasya", "milk, sugar").getInfo());
        buyers.add(new Buyer("Tolik", "nuts, bread").getInfo());
        buyers.add(new Buyer("John", "meat, bread").getInfo());
        buyers.add(new Buyer("Petya", "apples").getInfo());

        for (String buyer : buyers) {
            System.out.println(buyer + "\nPrice:" + (1 + (int) (Math.random() * 10)) + "$");
            System.out.println("Paid\n");
        }
    }
}
