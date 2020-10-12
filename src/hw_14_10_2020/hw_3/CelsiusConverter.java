package hw_14_10_2020.hw_3;

public class CelsiusConverter implements Converter {

    @Override
    public double converter(double value) {
        return (value * 9 / 5) + 32;
    }

    @Override
    public double otherConverter(double value) {
        return value + 273.15;
    }
}
