package lab;

public abstract class Extra implements Tobachini {

    protected Tobachini tobachini;
    protected double price;
    protected String name;

    public Extra(Tobachini tobachini, double price, String name) {
        this.tobachini = tobachini;
        this.price = price;
        this.name = name;
    }
    public String getName() {
        return this.name + ", " + tobachini.getName();
    }

}
