package hw_09_11_2020.hw_3_2;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        ArrayFilter arrayFilter = (num -> num);

        for (int numb : array) {
            System.out.println(arrayFilter.printArray(numb));
        }
    }
}
