package hw_14_10_2020.hw_1;

public class Cat extends CatFamily{

    private String breed;


    public Cat(String breed, int weight, int height) {
        super("Cat");
        this.breed = breed;
        super.weight = weight;
        super.height = height;
    }

    public void printBreed(){
        System.out.println(getTypeofanimaml() + " breed: " + breed);
    }

    public void meow(){
        System.out.println("Cat says: " + voice("Meow"));
    }

    public void params(){
        System.out.println("Weight " + getWeight() + "kg, height " + getHeight() + "cm");
    }

    public void eaten(){
        System.out.println("The cat was " + isEaten());
    }

    public void eating(){
        System.out.println("The cat is " + eat());
    }


}
