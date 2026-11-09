package prac4;

public class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужская футболка: размер " + size + ", цена " + cost + ", цвет " + color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женская футболка: размер " + size + ", цена " + cost + ", цвет " + color);
    }
}