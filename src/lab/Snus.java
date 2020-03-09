package lab;

public class Snus extends nonSmokingTobacco {
    protected int weight;
    public Snus(String name, double price, double nicotine, int weight) {
        super(name, price, nicotine);
        System.out.println("Название: " + name + ", цена: " + price + ", содержание никотина: " + nicotine + ", вес: " + weight);
    }
}
