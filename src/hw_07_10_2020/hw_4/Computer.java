package hw_07_10_2020.hw_4;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private String procType;
    private int ram;
    private int sizeHD;

    public Computer(String procType, int ram, int sizeHD) {
        this.procType = procType;
        this.ram = ram;
        this.sizeHD = sizeHD;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "Тип процессора '" + procType + '\'' +
                ", объем оперативной памяти " + ram +
                ", размер жесткого жиска " + sizeHD +
                '}';
    }

    public static void turnOn(boolean boolTrue) {

        int random = (int) (Math.random() * 2);

        boolean error = true;

        System.out.println("Введите число для запуска компьютера (0 или 1): ");
        Scanner scanner = new Scanner(System.in);

        int rand = scanner.nextInt();

       // System.out.println(random);

        if (error == boolTrue) {
            if (rand == random) {
                System.out.println("Компьютер включен");
            } else {
                System.out.println("Упс, компьютер сгорел");
                error = false;

                turnOn(error);
            }
        } else {
            System.out.println("Компьютер сгорел и не включится");
        }

    }

    public static void shutdown(boolean boolTrue) {

        int random = (int) (Math.random() * 2);

        boolean error = true;

        System.out.println("Введите число для выключения компьютера (0 или 1): ");
        Scanner scanner = new Scanner(System.in);

        int rand = scanner.nextInt();

        System.out.println(random);

        if (error == boolTrue) {
            if (rand == random) {
                System.out.println("Компьютер выключен");
            } else {
                System.out.println("Упс, компьютер сгорел");
                error = false;

                turnOn(error);
            }
        } else {
            System.out.println("Компьютер сгорел и не выключится");
        }
    }

}
