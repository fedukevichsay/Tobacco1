package lab;

import lab.Decorator.Tobachini;

public abstract class Tobacco implements Tobachini {
    protected String name;
    protected double nicotine;
    protected double price;


    public Tobacco(String name, double price, double nicotine) {
        this.name = name;
        this.price = price;
        this.nicotine = nicotine;
    }



    public double getPrice() {
        return this.price;
    }

    public String getName  () {
        return this.name;
    }
}

