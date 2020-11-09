package hw_09_11_2020.hw_3_3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {


    public static int sumAll(List<Integer> numbers, Predicate<Integer> p) {
        int total = 0;

        for (int num : numbers){
            if(p.test(num)){
                total += num;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add((int) (30 * Math.random() - 15));
        numbers.add((int) (30 * Math.random() - 15));
        numbers.add((int) (30 * Math.random() - 15));
        numbers.add((int) (30 * Math.random() - 15));
        numbers.add((int) (30 * Math.random() - 15));
        numbers.add((int) (30 * Math.random() - 15));
        numbers.add((int) (30 * Math.random() - 15));

        for (int num : numbers) {
            System.out.println(num );
        }

        System.out.println("\nSum n > 3: " + sumAll(numbers, n -> n > 3));
        System.out.println("Sum even: " + sumAll(numbers, n -> n % 2 == 0));
        System.out.println("Sum odd: " + sumAll(numbers, n -> n % 2 == 1));
        System.out.println("Sum n > 0: " + sumAll(numbers, n -> n > 0));
        System.out.println("Sum n < 0: " + sumAll(numbers, n -> n < 0));
    }
}
