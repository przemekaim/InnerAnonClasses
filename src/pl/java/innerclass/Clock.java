package pl.java.innerclass;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Clock {
    final private boolean beep;
    final private int interval;

    public Clock(boolean beep, int interval) {
        this.beep = beep;
        this.interval = interval;
    }

    public void start() {
        ActionListener listener = new TalkingClock();
        Timer t = new Timer(interval, listener);
        t.start();
    }

    public void contact() {
        TalkingClock t = new TalkingClock();
        t.saySth();
    }

    private class TalkingClock implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(beep)
                System.out.println("Jest godzina: " + new Date());
        }

        private void saySth() {
            System.out.println("Inner class");
        }
    }
}
