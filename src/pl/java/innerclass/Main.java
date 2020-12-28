package pl.java.innerclass;

import javax.swing.*;

import java.util.*;
import java.util.function.IntConsumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Klasa wewnetrza "zwykla" -----------------------
        //Clock clock = new Clock(true, 10000);
        //clock.start();


        // Klasa lokalna ------------------
        //LocalClock localClock = new LocalClock(true, 5000);
        //localClock.start();

        // Klasa wewnetrzna wywolywanie metod - klasa publiczna
        //Clock cl = new Clock(true, 5000);
        //Clock.TalkingClock abc = cl.new TalkingClock();
        //abc.saySth();
        // klasa prywatna
        //cl.contact();

        //Klasa anonimowa -----------------
        //AnonymousClock anonymousClock = new AnonymousClock();
        //anonymousClock.start(true, 2000);

        //Lambda zamiast klasy anonimowej ---------------
        //LambdaClock lambdaClock = new LambdaClock();
        //lambdaClock.start(true, 2000);
        //lambdaClock.start2(true, 2000);


        //Klasa statyczna
        double[] d = new double[100];
        for (int i = 0; i < d.length; i ++) {
            d[i] = 100 * Math.random();
        }


        StaticPair xd = new StaticPair();
        StaticPair.FindPair find = StaticPair.find(d);
       // StaticPair.FindPair f = xd.new FindPair(5, 2);
        System.out.println("min: "+ find.getLow() + " max: " + find.getHigh());



        //JOptionPane.showMessageDialog(null, "Betonuj");
        //System.exit(0);
/*
        Predicate<String> abd = a -> a.endsWith("x");
        String aaa = "xxxxxx";
        String aa = "xxxxxd";
        System.out.println(abd.test(aaa));
        System.out.println(abd.test(aa));*/

    }
}
