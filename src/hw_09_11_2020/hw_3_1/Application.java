package hw_09_11_2020.hw_3_1;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        CarMall carMall = new CarMall();

        List<Car> filteredCarsByCompany = carMall.showCars((c-> c.getPrice() > 10000));
        System.out.println(filteredCarsByCompany);
    }
}
