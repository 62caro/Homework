package hw_04_11_2020;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Hw_1_3 {

    public static void main(String[] args) {
        String text;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text: ");
        text = scanner.nextLine();

        StringBuilder stringBuilder = new StringBuilder(text);

        try(FileWriter writer = new FileWriter("notes.txt", false))
        {
            String temp = String.valueOf(stringBuilder.reverse());
            System.out.println(temp);

            writer.write(temp);
            writer.flush();

            System.out.println("Success!");
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}