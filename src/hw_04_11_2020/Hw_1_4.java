package hw_04_11_2020;

import java.io.*;

public class Hw_1_4 {

    public static void main(String[] args) {

        String[] words;
        String word = null;

        try {
            File file = new File("D:\\file.txt");

            FileReader fr = new FileReader(file);

            BufferedReader reader = new BufferedReader(fr);

            String line = reader.readLine();
            while (line != null) {
                System.out.println("Text in file: " + line);
                word = line;

                line = reader.readLine();
            }
            words = word.split(" ");
            System.out.println("Reverse: ");
            for (int i = words.length - 1; i >= 0; i--) {
                System.out.print (words[i] + " ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
