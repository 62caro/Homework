package hw_04_11_2020;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hw_3_1 {

    private static final String IP_PATTERN =
            "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

    public static void main(String[] args) {
        String text;
        boolean bool;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter IP: ");

        text = s.next();
        bool = validate(text);
        if (bool) {
            System.out.println("The string is ip");
        } else {
            System.out.println("The string is not ip");
        }
    }

    public static boolean validate(String ip) {
        Pattern pattern = Pattern.compile(IP_PATTERN);
        Matcher matcher = pattern.matcher(ip);
        return matcher.matches();
    }
}
