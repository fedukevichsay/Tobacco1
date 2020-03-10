package lab;

public class myata extends Extra {
    public myata(Tobachini tobachini, double price, String name){
        super(tobachini, price, name);
    }

    @Override
    public double getPrice() {
        return this.price + tobachini.getPrice();
    }
}
