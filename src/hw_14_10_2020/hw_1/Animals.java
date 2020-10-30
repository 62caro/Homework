package hw_14_10_2020.hw_1;

public abstract class Animals implements AnimalActions {

    protected int weight;
    protected int height;


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String voice(String say) {
        return say;
    }

    public abstract String isEaten();

    public abstract String eat();

    @Override
    public  void move() {
        System.out.println("Is moving");
    }



}
