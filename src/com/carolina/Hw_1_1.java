package com.carolina;

import java.util.Scanner;

public class Hw_1_1 {

    public static void main(String[] args) {
        double a = 0, b = 0, r = 0, d = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите стороно a: ");
        a = scanner.nextDouble();
        System.out.println("Введите стороно b: ");
        b = scanner.nextDouble();

        d = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Диагональ квадрата равна " + d);

        System.out.println("Введите радиус круга ");
        r = scanner.nextDouble();

        if((d == r * 2) || (r * 2 > d))
            System.out.println("Прямогольное отверстие можно закрыть кругом");
        else
            System.out.println("Прямогольное отверстие нельзя закрыть кругом");


    }
}
