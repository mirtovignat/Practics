package prac2;

class BookShelf {
    private final Book[] books;
    private int count = 0;

    public BookShelf(int size) {
        books = new Book[size];
    }

    public void addBook(Book b) {
        if (count < books.length) books[count++] = b;
    }

    public Book getEarliest() {
        if (count == 0) return null;
        Book min = books[0];
        for (int i = 1; i < count; i++) {
            if (books[i].getYear() < min.getYear()) min = books[i];
        }
        return min;
    }

    public Book getLatest() {
        if (count == 0) return null;
        Book max = books[0];
        for (int i = 1; i < count; i++) {
            if (books[i].getYear() > max.getYear()) max = books[i];
        }
        return max;
    }

    public void sortByYear() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (books[j].getYear() > books[j + 1].getYear()) {
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
    }

    public Book[] getBooks() {
        return books;
    }
}