package lab;

public class Snuff extends nonSmokingTobacco {
    protected int weight;
    public Snuff(String name, double price, double nicotine, int weight) {
        super(name, price, nicotine);
        System.out.println("Название: " + name + ", цена: " + price + ", содержание никотина: " + nicotine + ", вес: " + weight);
    }
}
