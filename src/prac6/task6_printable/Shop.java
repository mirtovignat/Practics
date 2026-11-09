package prac6;

public class Shop implements Printable {
    private final String shopName;

    public Shop(String shopName) {
        this.shopName = shopName;
    }

    @Override
    public void print() {
        System.out.println("Магазин: " + shopName);
    }
}