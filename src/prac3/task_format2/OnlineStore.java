package prac3;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class OnlineStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название товара: ");
        String productName = scanner.nextLine();

        System.out.print("Введите стоимость товара в рублях: ");
        double productPrice = scanner.nextDouble();

        System.out.print("Выберите валюту для оплаты (1 - RUB, 2 - USD, 3 - EUR): ");
        int currencyChoice = scanner.nextInt();

        NumberFormat formatter;

        if (currencyChoice == 2) {
            formatter = NumberFormat.getCurrencyInstance(Locale.US);
            productPrice = productPrice / 90.5;
        } else if (currencyChoice == 3) {
            formatter = NumberFormat.getCurrencyInstance(Locale.FRANCE);
            productPrice = productPrice / 98.3;
        } else {
            formatter = NumberFormat.getCurrencyInstance(new Locale("ru", "RU"));
        }

        System.out.println("\n--- Чек ---");
        System.out.println("Товар: " + productName);
        System.out.println("К оплате: " + formatter.format(productPrice));

        scanner.close();
    }
}