package hw_28_10_2020.hw_4;

public class Car {

    private String brand;
    private String desc;

    public Car(String brand, String desc) {
        this.brand = brand;
        this.desc = desc;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String info(){
        return brand + " info: " + desc;
    }
}
