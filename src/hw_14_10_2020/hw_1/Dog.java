package hw_14_10_2020.hw_1;

public class Dog extends DogFamily{

    private String breed;

    public Dog(String breed, int weight, int height) {
        super("Dog");
        this.breed = breed;
        super.weight = weight;
        super.height = height;
    }

    public void printBreed(){
        System.out.println(getTypeofanimaml() + " breed: " + breed);
    }

    public void woof(){
        System.out.println("Dog says: " + voice("woof"));
    }

    public void params(){
        System.out.println("Weight " + getWeight() + "kg, height " + getHeight() + "cm");
    }

    public void eating(){
        System.out.println("The dog is " + eat());
    }

}
