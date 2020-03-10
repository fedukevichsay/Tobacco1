package lab;

public class HookahTobacco extends SmokingTobacco {
    protected int weight;
    public HookahTobacco(String name, double price, double nicotine, int weight) {
        super(name, price, nicotine);
//      System.out.println("Название: " + name + ", цена: " + price + ", содержание никотина: " + nicotine + ", вес: " + weight);

    }
}
