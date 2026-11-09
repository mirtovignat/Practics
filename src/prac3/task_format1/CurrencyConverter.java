package prac3;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму в рублях: ");
        double rublesAmount = scanner.nextDouble();

        double usdRate = 90.5;
        double eurRate = 98.3;

        double dollarsAmount = rublesAmount / usdRate;
        double eurosAmount = rublesAmount / eurRate;

        NumberFormat rubleFormat = NumberFormat.getCurrencyInstance(new Locale("ru", "RU"));
        NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat euroFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("Сумма в рублях: " + rubleFormat.format(rublesAmount));
        System.out.println("Сумма в долларах: " + dollarFormat.format(dollarsAmount));
        System.out.println("Сумма в евро: " + euroFormat.format(eurosAmount));

        scanner.close();
    }
}