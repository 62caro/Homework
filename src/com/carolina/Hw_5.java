package com.carolina;

/*Создать зубчатый (рваный) двумерный массив, заполненный случайными числами, вывести его
элементы на экран. Каждая строка зубчатого двумерного массива должны быть произвольной длины. Длина строки должна
выбираться случайно. Использовать класс Random или Math.random().*/

import java.util.Scanner;

public class Hw_5 {

    public static void main(String[] args) {
        int a;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        a = scanner.nextInt();


        int[][] array = new int[a][];

        for (int i = 0; i < array.length; i++){
            array[i] = new int[(int) (Math.random() * 7)];
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = (int) (Math.random() * 100);
            }
        }

        System.out.println("Массив: ");
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


    }

}
