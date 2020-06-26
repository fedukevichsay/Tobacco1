package lab.Decorator;

public class Exclusive extends Extra {
    public Exclusive(Tobachini tobachini, double price, String name){
        super(tobachini, price, name);
    }

    @Override
    public double getPrice() {
        return this.price + tobachini.getPrice();
    }
}
