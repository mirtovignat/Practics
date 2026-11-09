package prac2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        String[] suits = {"Пики", "Черви", "Бубны", "Трефы"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};

        ArrayList<String> deck = new ArrayList<>();
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " " + suit);
            }
        }
        Collections.shuffle(deck);

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество игроков: ");
        int n = sc.nextInt();

        if (n * 5 > deck.size()) {
            System.out.println("Слишком много игроков!");
            return;
        }

        int cardIndex = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Игрок " + (i + 1) + ":");
            for (int j = 0; j < 5; j++) {
                System.out.println("  " + deck.get(cardIndex++));
            }
            System.out.println();
        }
    }
}