package hw_14_10_2020.hw_1;

public class Mouse extends MouseFamily {

    private String breed;

    public Mouse(String breed, int weight, int height) {
        super("Mouse");
        this.breed = breed;
        super.weight = weight;
        super.height = height;
    }

    public void printBreed(){
        System.out.println(getTypeofanimaml() + " breed: " + breed);
    }

    public void piii(){
        System.out.println("Mouse says: " + Mouse.voice("piii"));
    }

    public void params(){
        System.out.println("Weight " + getWeight() + "gr, height " + getHeight() + "cm");
    }

    public void eaten(){
        System.out.println("The mouse " + isEaten());
    }
}
