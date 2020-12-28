package pl.java.innerclass;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class LocalClock {
/*
    private final boolean beep;
    private final int interval;

    public LocalClock(boolean beep, int interval) {
        this.beep = beep;
        this.interval = interval;
    } // Nie potrzebne, mozna przekazac w metodzie start
*/

    public void start (boolean beep, int interval) {
        class LocalTalkingClock implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (beep)
                    System.out.println("Jest godzina:" + new Date());
                //interval--; Nie mozna - final lub effective final
            }
        }
        ActionListener listener = new LocalTalkingClock();
        Timer t = new Timer(interval, listener);
        t.start();

    }
}
