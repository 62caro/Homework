package hw30_09_2020;

/*Дано натуральное число n>1. Используя рекурсию, необходимо проверить, является ли оно простым. Программа должна вывести фразу «Is number <your number> simple - YES», если число простое и «Is number <your number> simple - NO», если число составное.
Для вывода информации используйте метод printf.
*/

public class Hw_5 {
    public static void main(String[] args) {
        int n = 2;
        if (recursion(n, 2)) {
            System.out.printf("Is number %d simple - YES\n", n);
        } else {
            System.out.printf("Is number %d simple - NO\n", n);
        }
    }

    public static boolean recursion(int n, int i) {

        if (n < 2) {
            return false;
        }
        else if (n == 2) {
            return true;
        }
        else if (n % i == 0) {
            return false;
        }
        else if (i < n / 2) {
            return recursion(n, i + 1);
        } else {
            return true;
        }
    }
}
