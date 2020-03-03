package lab;

import java.awt.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Tobacco Stick = new Stick ("IQOS", 0.9, 20);
        Tobacco Cigarette = new Cigarette("Winston", 0.6, 20);
        List<Tobacco> shop = Arrays.asList(Cigarette,Stick);
        for (Tobacco d: shop){
            
        }

    }
}
