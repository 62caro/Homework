package hw_04_11_2020;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hw_3_3 {

    private static final String domain_patter =
            "^(https?://)?([0-9A-Za-z]+.)([A-Za-z]+)([/?&]|$)";

    public static void main(String[] args) {
        String text;
        boolean bool;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter domain: ");

        text = s.next();
        bool = validate(text);
        if (bool) {
            System.out.println("Success");
        } else {
            System.out.println("Error");
        }
    }

    public static boolean validate(String ip) {
        Pattern pattern = Pattern.compile(domain_patter);
        Matcher matcher = pattern.matcher(ip);
        return matcher.matches();
    }
}
