package lab;

public abstract class Tobacco {
    protected String name;
    protected double nicotine;
    protected double price;

    public Tobacco(String name, double price, double nicotine) {
        this.name = name;
        this.price = price;
        this.nicotine = nicotine;
    }
}

