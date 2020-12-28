package pl.java.innerclass;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class AnonymousClock {
    public void start(boolean beep, int interval) {
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (beep)
                    System.out.println("Jest godzina: " + new Date());
            }
        };
        Timer t = new Timer(interval, actionListener);
        t.start();
    }
}
