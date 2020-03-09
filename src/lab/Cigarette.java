package lab;

public class Cigarette extends SmokingTobacco {
    protected int quantity;
    public Cigarette(String name,double price, double nicotine, int quantity) {
        super(name, price, nicotine);
        System.out.println("Название: " + name + ", цена: " + price + ", содержание никотина: " + nicotine + ", количество в упаковке: " + quantity);
    }
}
