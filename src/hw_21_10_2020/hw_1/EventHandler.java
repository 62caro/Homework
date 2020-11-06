package hw_21_10_2020.hw_1;

import java.awt.event.ActionEvent;
import java.util.EventListener;

public interface EventHandler extends EventListener {
    void actionPerformed() throws InterruptedException;
}
