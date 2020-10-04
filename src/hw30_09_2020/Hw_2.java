package hw30_09_2020;

/*Одноклеточная амеба каждые 3 часа делится на 2 клетки.
Необходимо определить, сколько амеб будет через 3, 6, 9, 12,..., 24 часа.*/

public class Hw_2 {
    public static void main(String[] args) {
        int i = 3;
        int cell = 0;

        while (i <= 24) {
            cell += 2;
            System.out.printf("За %d часа(-ов) будет %d амеб(-ы)\n", i, cell);
            i += 3;
        }
    }
}
