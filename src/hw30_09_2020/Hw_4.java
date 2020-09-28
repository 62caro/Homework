package hw30_09_2020;

import java.util.Arrays;
import java.util.Scanner;

/*Пользователь вводит с клавиатуры число большее 3, которое сохраняется в переменную n.

Если пользователь ввёл не подходящее число, то программа
должна выдать соответствующее сообщение.

Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.

Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
*/

public class Hw_4 {
    public static void main(String[] args) {
        int n = printNum();
        int temp = 0;

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*n);
            if(array[i] % 2 == 0){
                temp++;
            }
        }
        int[] array1 = new int[temp];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0 && array[i] > 0) {
                array1[count] = array[i];
                count++;
            }
        }

        System.out.println("Массив 1: " + Arrays.toString(array));
        System.out.println("Массив 2: " + Arrays.toString(array1));

    }

    private static int printNum(){
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число больше 3");
        n = scanner.nextInt();

        if (n < 3) {
            System.out.println("Неправильно введено число");
            printNum();
        }
        return n;
    }
}
