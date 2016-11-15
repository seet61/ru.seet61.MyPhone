package ru.seet61.MyPhone;

/**
 * Created by dmitry.arefyev on 15.11.2016.
 */
public class MyPhone {
    public static void main(String[] args) {
        Phone p1 = new Phone("Nokia", 769);
        Phone p2 = new Phone("HTC", 550);

        p1.saveLastCall();
        System.out.println(p1.getPrice());
    }
}
