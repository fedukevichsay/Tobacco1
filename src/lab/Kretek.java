package lab;

public class Kretek extends SmokingTobacco {
    protected int quantity;
    public Kretek(String name,double price, double nicotine, int quantity) {
        super(name, price, nicotine);
        System.out.println("Название: " + name + ", цена: " + price + ", содержание никотина: " + nicotine + ", количество в упаковке: " + quantity);
}
}
