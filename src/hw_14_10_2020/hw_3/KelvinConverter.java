package hw_14_10_2020.hw_3;

public class KelvinConverter implements Converter {
    @Override
    public double converter(double value) {
        return value + 273.15;
    }

    @Override
    public double otherConverter(double value) {
        return (value - 273.15) * 9 / 5 + 32;
    }
}
