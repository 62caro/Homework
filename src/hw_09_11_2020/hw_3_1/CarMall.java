package hw_09_11_2020.hw_3_1;

import java.util.ArrayList;
import java.util.List;

public class CarMall {

    private List<Car> cars = new ArrayList<>();

    public CarMall() {
        cars.add(new Car("Honda", 2012, 9000, "SEDAN"));
        cars.add(new Car("BMW", 2013, 10200, "SEDAN"));
        cars.add(new Car("Ford", 2010, 9600, "SEDAN"));
        cars.add(new Car("FIAT", 2010, 8200, "SEDAN"));
    }

    public List<Car> showCars(CarFilter carFilter){
        ArrayList<Car> filterCars = new ArrayList<>();

        for (Car car : cars){
            if (carFilter.showCar(car)){
                filterCars.add(car);
            }
        }
        return filterCars;
    }
}
