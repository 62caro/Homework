package hw_14_10_2020.hw_2;

public class Main {

    public static void main(String[] args) {
        Ball ball = new Ball(10);
        Cylinder cylinder = new Cylinder(4, 1);
        Pyramid pyramid = new Pyramid(100, 100);

        Box box = new Box(1000);

        System.out.println(box.add(ball));
        System.out.println(box.add(cylinder));
        System.out.println(box.add(pyramid));
    }
}
