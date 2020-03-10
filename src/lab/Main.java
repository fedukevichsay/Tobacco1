package lab;

import java.awt.*;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Object[] array = new Object[11];
//        Object obj = null;
//        Random randomizer = new Random();
//        for (int i=0; i<11; i++) {
//            int randomNumber = randomizer.nextInt(11);
//            switch(randomNumber) {
//                case 0:
//                    obj = new Bidi("Darshan", 2.25,1.9,15);
//                    break;
//                case 1:
//                    obj = new ChewingTobacco("RED MEN", 9.85, 30, 86);
//                    break;
//                case 2:
//                    obj = new Cigar("Cohiba", 19.75, 7.2, 3);
//                    break;
//                case 3:
//                    obj = new Cigarette("Wintson",2.20, 0.5,20);
//                    break;
//                case 4:
//                    obj = new Cigarillo("Captian Black", 9.50, 1.2, 20);
//                    break;
//                case 5:
//                    obj = new HookahTobacco("Must Have", 11.20, 450, 125 );
//                    break;
//                case 6:
//                    obj = new Kretek("Dji Sam Soe",4.50,2.2, 16 );
//                    break;
//                case 7:
//                    obj = new PipeTobacco("Cult", 9.25, 12, 50);
//                    break;
//                case 8:
//                    obj = new Snuff("President", 5.25, 12, 75);
//                    break;
//                case 9:
//                    obj = new Snus("Shiro", 7.55, 6.2, 12);
//                case 10:
//                    obj = new Stick("IQOS", 2.5, 0.4, 20);
//                    break;
//            }
//            array[i] = obj;
//        }
        Tobachini order = new HookahTobacco("Must Have", 11.20, 450, 125 );
        order = new myata(order,0.75,"myata");
        order = new Delivery (order, 7.50, "Tomsk");
        order = new Exclusive(order,3.40, "Exclusive Set");
        System.out.println(order.getPrice());
        System.out.println(order.getName());
    }
}
