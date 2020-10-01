package hw_07_10_2020.hw_2;

public class Calculator {
    private double x, y;

    public Calculator(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


    public double printResultMult() {
        return x * y;
    }

    public double printResultSumm() {
        return x + y;
    }

    public double printResultSub() {
        return x - y;
    }

    public double printResultDev() {
        return x/y;
    }
}
