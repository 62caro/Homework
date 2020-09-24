package com.carolina;

/*Создать двумерный массив, размером n x n (размер массива вводить с консоли). Если элемент массива является четным числом,
вывести 0, если не четным 1. Использовать циклы.
Пример вывода:
01001
01011
11100
00100
10101
Для ввода данных с консоли использовать класс Scanner.
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();*/

import java.util.Arrays;
import java.util.Scanner;

public class Hw_4 {

    public static void main(String[] args) {
        int a, b;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество строк: ");
        a = scanner.nextInt();
        System.out.println("Введите количество столбцов: ");
        b = scanner.nextInt();

        int[][] array = new int[a][b];

        for (int i = 0; i < a; i++){
            for (int j = 0; j < b; j++){
                array[i][j] = (int) (Math.random() * 56);
            }
        }

        System.out.println("Исходный массив " + Arrays.deepToString(array));
        for (int i = 0; i < a; i++){
            for (int j = 0; j < b; j++){
                if (array[i][j] % 2 == 0) {
                    array[i][j] = 0;
                } else {
                    array[i][j] = 1;
                }
            }
        }
        System.out.println("Чет (0) /нечет (1): \t\t" + Arrays.deepToString(array));

    }

}
