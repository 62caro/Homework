package hw_14_10_2020.hw_2;

import java.util.ArrayList;

public class Box extends Shape {

    private ArrayList shapes = new ArrayList<>();
    private double available;

    public Box(double available) {
        super(available);
        this.available = available;
    }

    public boolean add(Shape shape) {
        if (available >= shape.getVolume()) {
            shapes.add(shape);
            available -= shape.getVolume();
            return true;
        } else {
            System.out.println("Can't add a shape");
            return false;
        }
    }


}
