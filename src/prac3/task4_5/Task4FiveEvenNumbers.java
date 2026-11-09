package prac3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task4FiveEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = 0;

        while (true) {
            System.out.print("Введите натуральное число больше 0: ");
            if (scanner.hasNextInt()) {
                arraySize = scanner.nextInt();
                if (arraySize > 0) {
                    break;
                } else {
                    System.out.println("Число должно быть больше 0. Повторите ввод.");
                }
            } else {
                System.out.println("Ошибка! Введите целое число.");
                scanner.next(); 
            }
        }

        int[] firstArray = new int[arraySize];
        Random randomGenerator = new Random();
        System.out.print("Исходный массив: ");
        for (int index = 0; index < arraySize; index++) {
            firstArray[index] = randomGenerator.nextInt(arraySize + 1);
            System.out.print(firstArray[index] + " ");
        }
        System.out.println();

        int evenCount = 0;
        for (int number : firstArray) {
            if (number % 2 == 0 && number != 0) {
                evenCount++;
            }
        }

        if (evenCount > 0) {
            int[] evenArray = new int[evenCount];
            int evenIndex = 0;
            for (int number : firstArray) {
                if (number % 2 == 0 && number != 0) {
                    evenArray[evenIndex++] = number;
                }
            }
            System.out.println("Массив четных элементов: " + Arrays.toString(evenArray));
        } else {
            System.out.println("В исходном массиве нет четных элементов.");
        }
        
        scanner.close();
    }
}