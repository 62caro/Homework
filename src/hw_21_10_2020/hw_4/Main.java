package hw_21_10_2020.hw_4;

public class Main {

    public static void main(String[] args) throws StartException {
        Car audi = new Car("Audi", 280, 40000);
        Car porsche = new Car("Porsche", 300, 70000);
        Car bmw = new Car("BMW", 280, 40000);


        audi.start();
        porsche.start();
        bmw.start();
    }
}
