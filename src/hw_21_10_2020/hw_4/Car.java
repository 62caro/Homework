package hw_21_10_2020.hw_4;


public class Car {

    private String car_brand;
    private int speed;
    private int price;

    public Car(String car_brand, int speed, int price) {
        this.car_brand = car_brand;
        this.speed = speed;
        this.price = price;
    }

    public String getCar_brand() {
        return car_brand;
    }

    public void setCar_brand(String car_brand) {
        this.car_brand = car_brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void start() throws StartException {
        int rand;
        rand = (int) (Math.random() * 20);

        if (rand % 2 == 0) {
            throw new StartException("Number is even");
        } else System.out.println(car_brand + " started");
    }
}
