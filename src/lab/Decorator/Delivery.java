package lab.Decorator;

public class Delivery extends Extra {
    public Delivery(Tobachini tobachini, double price, String name){
        super(tobachini, price, name);
    }

    @Override
    public double getPrice() {
        return this.price + tobachini.getPrice();
    }
}
