package prac2;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = scanner.nextLine().trim();

        if (text.isEmpty()) {
            System.out.println("Слов введено: 0");
        } else {
            String[] words = text.split("\\s+");
            System.out.println("Слов введено: " + words.length);
        }
        scanner.close();
    }
}