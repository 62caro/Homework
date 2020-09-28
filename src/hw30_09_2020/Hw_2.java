package hw30_09_2020;

public class Hw2 {
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
