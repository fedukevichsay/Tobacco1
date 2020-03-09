package lab;

public class Cigarillo extends SmokingTobacco {
    protected int quantity;
    public Cigarillo(String name,double price, double nicotine, int quantity) {
        super(name, price, nicotine);
        System.out.println("Название: " + name + ", цена: " + price + ", содержание никотина: " + nicotine + ", количество в упаковке: " + quantity);
    }
}
