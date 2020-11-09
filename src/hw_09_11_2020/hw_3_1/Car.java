package hw_09_11_2020.hw_3_1;

public class Car {

    private String company;
    private int year;
    private double price;
    private String type;

    public Car(String company, int year, double price, String type) {
        this.company = company;
        this.year = year;
        this.price = price;
        this.type = type;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", type='" + type + '\'' +
                '}';
    }
}
