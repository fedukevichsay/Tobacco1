package lab;

public class PipeTobacco extends SmokingTobacco {
    protected int weight;
    public PipeTobacco(String name, double price, double nicotine, int weight) {
        super(name, price, nicotine);
        System.out.println("Название: " + name + ", цена: " + price + ", содержание никотина: " + nicotine + ", вес: " + weight);
    }
}
