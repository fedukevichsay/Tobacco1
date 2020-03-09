package lab;

public class Cigar extends SmokingTobacco {
    protected int quantity;
    public Cigar(String name, double price, double nicotine, int quantity) {
        super(name, price, nicotine);
        System.out.println("Название: " + name + ", цена: " + price + ", содержание никотина: " + nicotine + ", количество в упаковке: " + quantity);
    }
}
