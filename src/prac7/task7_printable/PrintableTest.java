package prac7;

public class PrintableTest {
    public static void main(String[] args) {
        Printable[] printableArray = new Printable[]{
                new Book("Мастер и Маргарита"),
                new Magazine("Мурзилка"),
                new Book("Идиот"),
                new Magazine("Наука и жизнь")
        };

        System.out.println("Все книги:");
        Book.printBooks(printableArray);
        
        System.out.println("\nВсе журналы:");
        Magazine.printMagazines(printableArray);
    }
}