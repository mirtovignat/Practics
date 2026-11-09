package prac2;

import java.util.Arrays;

public class BookTest {
    public static void main(String[] args) {
        BookShelf shelf = new BookShelf(3);
        Book book1 = new Book("Пушкин", "Евгений Онегин", 1833);
        Book book2 = new Book("Толстой", "Война и мир", 1869);
        Book book3 = new Book("Булгаков", "Мастер и Маргарита", 1967);
        shelf.addBook(book1);
        shelf.addBook(book2);
        shelf.addBook(book3);

        System.out.println("Самая ранняя: " + shelf.getEarliest().getTitle());
        System.out.println("Самая поздняя: " + shelf.getLatest().getTitle());
        shelf.sortByYear();
        System.out.println("После сортировки: " + Arrays.toString(shelf.getBooks()));
    }
}