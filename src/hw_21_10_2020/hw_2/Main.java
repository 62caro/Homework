package hw_21_10_2020.hw_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String letter;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a letter: ");
        letter = scanner.nextLine();

        System.out.println("Position of the letter " + letter + " = " + Letter.valueOf(letter).getLetterPosition());
    }




}
