package prac4;

public class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужские штаны: размер " + size + ", цена " + cost + ", цвет " + color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женские штаны: размер " + size + ", цена " + cost + ", цвет " + color);
    }
}