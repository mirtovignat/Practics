package prac7;

public class Book implements Printable {
    private final String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Книга: " + title);
    }

    public static void printBooks(Printable[] printableArray) {
        for (Printable printableItem : printableArray) {
            if (printableItem instanceof Book) {
                printableItem.print();
            }
        }
    }

}