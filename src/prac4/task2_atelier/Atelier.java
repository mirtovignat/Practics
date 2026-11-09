package prac4;

public class Atelier {
    public static void main(String[] args) {
        Clothes[] clothesArray = new Clothes[]{
                new TShirt(ClothingSize.M, 1500.0, "Белый"),
                new Pants(ClothingSize.L, 3500.0, "Черный"),
                new Skirt(ClothingSize.S, 2500.0, "Красный"),
                new Tie(ClothingSize.XS, 1000.0, "Синий")
        };

        dressWomen(clothesArray);
        System.out.println();
        dressMan(clothesArray);
    }

    public static void dressWomen(Clothes[] clothesArray) {
        System.out.println("Женская одежда:");
        for (Clothes clothingItem : clothesArray) {
            if (clothingItem instanceof WomenClothing) {
                ((WomenClothing) clothingItem).dressWomen();
            }
        }
    }

    public static void dressMan(Clothes[] clothesArray) {
        System.out.println("Мужская одежда:");
        for (Clothes clothingItem : clothesArray) {
            if (clothingItem instanceof MenClothing) {
                ((MenClothing) clothingItem).dressMan();
            }
        }
    }
}