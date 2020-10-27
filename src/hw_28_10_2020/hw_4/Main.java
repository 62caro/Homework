package hw_28_10_2020.hw_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static Map<String, String> cars;

    public static void main(String[] args) {
        menu();
    }

    private static void menu(){
        cars = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("1 - Add car; 2 - Info about car; 3 - Buy; 4 - All list");
        number = scanner.nextInt();

        addCar();
        switch (number) {
            case 1:
                String model, brand, desc;
                model = scanner.next();
                brand = scanner.next();
                desc = scanner.next();

                addCar(model, brand, desc);
                showAll();
                menu();
                break;
            case 2:
                String search = scanner.next();
                System.out.println(cars.get(search));
                menu();
                break;
            case 3:
                String remove = scanner.next();
                cars.remove(remove);
                showAll();
                menu();
                break;
            case 4:
                showAll();
                menu();
                break;
        }
    }

    private static void addCar() {
        cars.put("A8", new Car("AUDI", "Max speed: 320 km/h").info());
        cars.put("X6", new Car("BMW", "Max speed: 300 km/h").info());
        cars.put("A6", new Car("AUDI", "Max speed: 240 km/h").info());
    }

    private static void addCar(String model,String brand, String desc) {
        cars.put(model, new Car(brand, desc).info());
    }

    private static void showAll() {
        cars.forEach((k, v) -> System.out.println("Model: " + k + ", brand: " + v));
    }
}
