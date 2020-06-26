package lab;

import lab.Composite.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//            для первой работы наследование
//        Object[] array = new Object[11];
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


//        для третьей работы декоратор
//        Tobachini order = new HookahTobacco("Must Have", 11.20, 450, 125 );
//        order = new myata(order,0.75,"myata");
//        order = new Delivery (order, 7.50, "Tomsk");
//        order = new Exclusive(order,3.40, "Exclusive Set");
//        System.out.println(order.getPrice());
//        System.out.println(order.getName());

//        для четвертой работы фабрика
//        CigaretteFactory factory = new CigaretteFactory();
//        Cigarettes XSsilver = factory.getCigarettes(CigarettesTypes.XSSILVER);
//        Cigarettes XSblue = factory.getCigarettes(CigarettesTypes.XSBLUE);
//        Cigarettes XStyle = factory.getCigarettes(CigarettesTypes.XSTYLE);
//
//        XSsilver.smoke();
//        XSblue.smoke();
//        XStyle.smoke();

//        для пятой работы регулярные выражения
//        String text = "Табачные изделия не рекомендуются к использованию лиц, не достигшим 18 лет!";
//        Pattern pattern = Pattern.compile("н.+?и");
//
//        Matcher matcher = pattern.matcher(text);
//        while (matcher.find()) {
//            int start=matcher.start();
//            int end=matcher.end();
//            System.out.println("Найдено совпадение " + text.substring(start,end) + " с "+ start + " по " + (end-1) + " позицию");
//        }
//        System.out.println(matcher.replaceFirst("продукции"));
//        System.out.println(matcher.replaceAll("лет"));
//        System.out.println(text);

//        для шестой работы абстрактная фабрика
//        HookahTobaccoAbsFactory factory;
//        factory = new AdalyanFactory();
//        factory.createHard();

//        для седьмой работы билдер
//        StickBuilder StickBuilder = new StickBuilder.Builder("IQOS").setColor("green").setTaste("Mentol Citrus").setKrepost(4).build();
//        System.out.println(StickBuilder.getBrand());
//        System.out.println(StickBuilder.getColor());
//        System.out.println(StickBuilder.getTaste());
//        System.out.println(StickBuilder.getKrepost());

//        для восьмой работы компановщик
//        Market foil05mm = new Foil();
//        Market foil02mm = new Foil();
//        Market coil25x25mm = new Coal();
//        Market coil22x22mm = new Coal();
//        Market nozzlesgreen = new Nozzles();
//        Market nozzlesred = new Nozzles();
//        Market nozzlesblack = new Nozzles();
//        Set setextraplus = new Set();
//        Set setmini = new Set();
//        Set setmedium = new Set();
//
//        setmini.addComponent(foil02mm);
//        setmini.addComponent(coil22x22mm);
//        setmini.addComponent(nozzlesblack);
//
//        setmini.present();

//        для восьмой работы итератор
//        ArrayList<String> product = new ArrayList<String>();
//        product.add("Bidi");
//        product.add("Cigar");
//        product.add("Cigarillo");
//        product.add("Kretek");
//        product.add("Cigarette");
//        product.add("Hookah tobacco");
//
//        ListIterator<String> listIter = product.listIterator();
//
//        while(((ListIterator) listIter).hasNext()){
//
//            System.out.println(listIter.next());
//        }
//        listIter.set("Sticks");
//        while(listIter.hasPrevious()){
//
//            System.out.println(listIter.previous());
//        }
    }
}
