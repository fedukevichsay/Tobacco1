package lab.Decorator;

import lab.Decorator.Extra;
import lab.Decorator.Tobachini;

public class myata extends Extra {
    public myata(Tobachini tobachini, double price, String name){
        super(tobachini, price, name);
    }

    @Override
    public double getPrice() {
        return this.price + tobachini.getPrice();
    }
}
