package hw_07_10_2020.hw_4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int i;

        System.out.println("Включить или выключить компьютер? (1 - включить, 2 - выключить): ");

        Scanner scanner = new Scanner(System.in);
        i = scanner.nextInt();

        switch (i){
            case 1: Computer.turnOn(true); break;
            case 2: Computer.shutdown(true); break;
            default:
                System.out.println("Нет таких действий");
        }

    }
}
