package hw_21_10_2020.hw_3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 2, 3, 10};
        int index;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter index: ");
        index = scanner.nextInt();

        System.out.println(ArrayClass.returnIndex(array, index));

    }
}
