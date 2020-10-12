package hw_14_10_2020.hw_3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double degree;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter degree to convert ");
        degree = scanner.nextDouble();

        CelsiusConverter celsiusConverter = new CelsiusConverter();
        System.out.println("Celsius to Fahrenheit " + celsiusConverter.converter(degree));
        System.out.println("Celsius to Kelvin " + celsiusConverter.otherConverter(degree) + "\n");

        KelvinConverter kelvinConverter = new KelvinConverter();
        System.out.println("Kelvin to Celsius " + kelvinConverter.converter(degree));
        System.out.println("Kelvin to Fahrenheit " + kelvinConverter.otherConverter(degree) + "\n");

        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        System.out.println("Fahrenheit to Celsius " + fahrenheitConverter.converter(degree));
        System.out.println("Fahrenheit to Kelvin " + fahrenheitConverter.otherConverter(degree));


    }
}
