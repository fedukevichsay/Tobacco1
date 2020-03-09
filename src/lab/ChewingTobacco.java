package lab;

public class ChewingTobacco extends nonSmokingTobacco {
    protected int weight;
    public ChewingTobacco(String name,double price, double nicotine, int weight) {
        super(name, price, nicotine);
        System.out.println("Название: " + name + ", цена: " + price + ", содержание никотина: " + nicotine + ", вес: " + weight);
    }
}
