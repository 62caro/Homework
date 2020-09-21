package com.carolina;

import java.util.Arrays;
import java.util.Scanner;

public class Hw_3_1 {
    public static void main(String[] args) {
        int sizeArray, indexMin = 0, indexMax = 0;
        double sum = 0, mult = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину массива ");
        sizeArray = scanner.nextInt();

        double[] array = new double[sizeArray];

        double maxValue = array[0], minValue = array[0];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите " + i + " элемент массива");
            array[i] = scanner.nextDouble();
        }
        System.out.println("Вектор: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {

            if (array[i] < 0){
                sum += array[i];
            }

            if (array[i] > maxValue){
                maxValue = array[i];
                indexMax = i;
            }
            if (array[i] < minValue){
                minValue = array[i];
                indexMin = i;
            }
        }

        for (int i = indexMax; i < indexMin; i++){
            mult *= array[i];
        }

        System.out.println("Произведение чисел " + mult);

        System.out.println("Сумма равна " + sum);
    }
}
