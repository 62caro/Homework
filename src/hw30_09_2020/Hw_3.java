package hw30_09_2020;

/*Напишите программу, определяющую сумму всех нечетных чисел от 1 от 99.*/

public class Hw_3 {
    public static void main(String[] args) {
        int i = 1;
        int summ = 0;

        while (i <= 99) {
            if (i % 2 == 1) {
                summ += i;
            }
            i++;
        }
        System.out.println("Сумма нечетных чисел от 1 до 99: " + summ);

    }
}
