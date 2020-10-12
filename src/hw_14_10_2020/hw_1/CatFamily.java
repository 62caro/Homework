package hw_14_10_2020.hw_1;

public class CatFamily extends Animals {

    private String typeofanimaml;

    public CatFamily(String typeofanimaml) {
        this.typeofanimaml = typeofanimaml;
    }

    public String getTypeofanimaml() {
        return typeofanimaml;
    }

    public void setTypeofanimaml(String typeofanimaml) {
        this.typeofanimaml = typeofanimaml;
    }

    public void typeOfCat(){
        System.out.println("This is a " + typeofanimaml);
    }


    @Override
    public String isEaten() {
        return "was eaten";
    }

    @Override
    public String eat() {
        return "eating";
    }
}
