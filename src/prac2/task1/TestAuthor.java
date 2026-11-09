package prac2;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Иван Иванов", "ivan@mail.ru", 'm');
        System.out.println(author);
        author.setEmail("newemail@mail.ru");
        System.out.println("После смены email: " + author);
    }
}