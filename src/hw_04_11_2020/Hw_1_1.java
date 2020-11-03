package hw_04_11_2020;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Hw_1_1 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter filename");
        String filename = scanner.nextLine();

        FileInputStream inputStream = new FileInputStream("D:/" + filename + ".txt");

        long max = 0;
        while (inputStream.available() > 0)
        {
            int data = inputStream.read();
            if (data > max){
                max = data;
            }
            System.out.println("Byte " + data);
        }
        inputStream.close();

        System.out.println("Max byte " + max);
    }
}
