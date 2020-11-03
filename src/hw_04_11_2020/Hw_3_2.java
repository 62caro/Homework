package hw_04_11_2020;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hw_3_2 {

    private static final String date_pattern = "[0-9]{4}/(0[1-9]|1[012])/(0[1-9]|1[0-9]|2[0-9]|3[01]/S^(([0,1][0-9])|(2[0-3])):[0-5][0-9]:[0-5][0-9]$)";

    public static void main(String[] args) {
        String text;
        boolean bool;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter date: ");

        text = s.next();
        bool = validate(text);
        if (bool) {
            System.out.println("Success");
        } else {
            System.out.println("Error");
        }
    }

    public static boolean validate(String date) {
        Pattern pattern = Pattern.compile(date_pattern);
        Matcher matcher = pattern.matcher(date);
        return matcher.matches();
    }
}
