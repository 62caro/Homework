package hw_09_11_2020.hw_2;

public class Cashbox extends Thread {

    private Buyer buyer;

    Cashbox(Buyer b) {
        this.buyer = b;
    }

    @Override
    public void run() {

        System.out.printf("Buyer %s pays %s \n", buyer.getName(), buyer.getShopping_list());
            try {
                sleep((long) (Math.random() * 10000));
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        System.out.printf("Buyer %s paid \n", buyer.getName());
    }
}
