package hw_09_11_2020.hw_3_1;

public class CompanyFilter implements CarFilter {
    private String company;


    public CompanyFilter(String company) {
        this.company = company;
    }

    @Override
    public boolean showCar(Car car) {
        return company.equals(car.getCompany());
    }
}
