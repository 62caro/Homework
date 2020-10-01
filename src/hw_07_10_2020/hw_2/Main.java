package hw_07_10_2020.hw_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double x, y;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число ");
        x = scanner.nextDouble();
        System.out.println("Введите второе число ");
        y = scanner.nextDouble();

        System.out.println("Сумма чисел равна " + new Calculator(x, y).printResultSumm() + "\n"
                            + "Разность чисел " + new Calculator(x, y).printResultSub() + "\n"
                            + "Умножение числе " + new Calculator(x, y).printResultMult() + "\n"
                            + "Деление чисел " + new Calculator(x, y).printResultDev());
    }
}
