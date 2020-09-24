package com.carolina;

/*Создать и заполнить массив случайными
числами, отсортировать массив по
возрастанию, используя метод сортировки
пузырьком.*/

import java.util.Arrays;


public class Hw_3_2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int temp = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("Исходный массив " + Arrays.toString(array));

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Отсортированный массив " + Arrays.toString(array));

    }
}
