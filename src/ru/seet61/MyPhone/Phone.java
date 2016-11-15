package ru.seet61.MyPhone;

/**
 * Created by dmitry.arefyev on 15.11.2016.
 */
public class Phone {
    private String model;
    private double price;
    private int memory;
    private boolean wpf;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Phone(String model, double price) {
        this(model, price, 16, false);
    }

    public Phone (String model, double price, int memory, boolean wpf) {
        this.model = model;
        this.price = price;
        this.memory = memory;
        this.wpf = wpf;
    }

    public Phone saveLastCall () {
        //Возвращаем самого себя для вызова нескольких методов подряд
        System.out.println("saved... " + this.model);
        return this;
    }


}
