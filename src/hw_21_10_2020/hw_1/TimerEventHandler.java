package hw_21_10_2020.hw_1;

public class TimerEventHandler implements EventHandler {
    @Override
    public void actionPerformed() throws InterruptedException {
        int i = 0;
        while (true) {
            System.out.printf("Elapsed time %d seconds \n", i);
            i += 10;
            Thread.sleep(10 * 1000);
        }
    }
}
