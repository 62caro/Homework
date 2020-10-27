package hw_28_10_2020.hw_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        List<Integer> copyKey = new ArrayList<>();
        List<String> copyValues = new ArrayList<>();

        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");

        map.forEach((k, v) -> System.out.println("Key: "+ k + ", Values: " + v));
        map.forEach((k, v) -> copyKey.add(k));
        map.forEach((k, v) -> copyValues.add(v));

        System.out.println("\nKeys: ");
        for(Integer c : copyKey){
            System.out.println(c);
        }

        System.out.println("\nValues: ");
        for (String c : copyValues) {
            System.out.println(c);
        }
    }
}
