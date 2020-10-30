package hw_14_10_2020.hw_1;

public class DogFamily extends Animals{

    private String typeofanimaml;

    public DogFamily(String typeofanimaml) {
        this.typeofanimaml = typeofanimaml;
    }

    public String getTypeofanimaml() {
        return typeofanimaml;
    }

    public void setTypeofanimaml(String typeofanimaml) {
        this.typeofanimaml = typeofanimaml;
    }

    public void typeOfDog(){
        System.out.println("This is a " + typeofanimaml);
    }


    @Override
    public String isEaten() {
        return "was not eaten";
    }

    @Override
    public String eat() {
        return "eating";
    }
}
