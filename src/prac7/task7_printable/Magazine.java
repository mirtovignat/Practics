package prac7;

public class Magazine implements Printable {
    private final String title;

    public Magazine(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Журнал: " + title);
    }

    public static void printMagazines(Printable[] printableArray) {
        for (Printable printableItem : printableArray) {
            if (printableItem instanceof Magazine) {
                printableItem.print();
            }
        }
    }
}