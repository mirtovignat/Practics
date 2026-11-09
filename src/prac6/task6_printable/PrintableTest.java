package prac6;

public class PrintableTest {
    public static void main(String[] args) {
        Printable[] printableArray = new Printable[3];
        printableArray[0] = new Book("Война и мир", "Толстой");
        printableArray[1] = new Shop("МВидео");
        printableArray[2] = new Book("Преступление и наказание", "Достоевский");

        for (Printable printableItem : printableArray) {
            printableItem.print();
        }
    }
}