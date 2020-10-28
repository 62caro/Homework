package hw_28_10_2020.hw_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<String, String> plants;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;

        plants = new HashMap<>();

        plants.put("Apple", "Fruit");
        plants.put("Pineapple", "Fruit");
        plants.put("Orange", "Fruit");
        plants.put("Tomato", "Vegetable");


        System.out.println("Enter name of plant: ");
        name = scanner.nextLine();

        searchPlant(name);

        System.out.println("\nAll list: ");
        printPlants();
    }

    public static void printPlants(){
        plants.forEach((k, v) -> System.out.println("Name: "+ k + ", Type: " + v));
    }

    public static void searchPlant(String name){
        System.out.println(plants.getOrDefault(name, "The plants doesn't exist"));
    }
}
