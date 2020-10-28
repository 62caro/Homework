package hw_28_10_2020.hw_2;

public class Buyer {

    private String name;
    private String shopping_list;

    public Buyer(String name, String shopping_list) {
        this.name = name;
        this.shopping_list = shopping_list;
    }

    public String getName() {
        return name;
    }

    public String getInfo(){
        return name + " buys " + shopping_list;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShopping_list() {
        return shopping_list;
    }

    public void setShopping_list(String shopping_list) {
        this.shopping_list = shopping_list;
    }
}
