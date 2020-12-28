package pl.java.innerclass;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.util.Date;

public class LambdaClock {


    public void start(boolean beep, int interval) {
        ActionListener actionListener = b -> {
            if(beep)
                System.out.println("Jest godzina: " + new Date());
            if(interval == 2000)
                System.out.println("xd");

        };
        Timer t = new Timer(interval, actionListener);
        t.start();
    }



    public void start2(boolean beep, int interval) {
        Timer t = new Timer(interval,  e -> {
            if(beep)
                System.out.println("Jest godzina: " + new Date());
            if (interval == 2000)
                System.out.println("Jeszcze inny sposob na lambde i prostrzy :D");
        });
        t.start();
    }
}
