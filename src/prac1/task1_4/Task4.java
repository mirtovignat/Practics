package prac1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int arraySize = scanner.nextInt();

        int[] array = new int[arraySize];
        System.out.println("Введите " + arraySize + " элементов:");
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }

        int sumWhile = 0, i = 0;
        while (i < array.length) {
            sumWhile += array[i++];
        }

        int sumDoWhile = 0;
        i = 0;
        do {
            sumDoWhile += array[i++];
        } while (i < array.length);

        int min = array[0], max = array[0];
        for (int j = 1; j < array.length; j++) {
            if (array[j] < min) min = array[j];
            if (array[j] > max) max = array[j];
        }

        System.out.println("Сумма (while):      " + sumWhile);
        System.out.println("Сумма (do-while):   " + sumDoWhile);
        System.out.println("Минимум: " + min);
        System.out.println("Максимум: " + max);

        scanner.close();
    }
}