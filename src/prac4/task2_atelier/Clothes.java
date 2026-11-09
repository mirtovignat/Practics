package prac4;

public abstract class Clothes {
    protected ClothingSize size;
    protected double cost;
    protected String color;

    public Clothes(ClothingSize size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }
}