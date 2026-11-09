package prac3;

import java.util.Arrays;
import java.util.Random;

public class Task1Arrays {
    public static void main(String[] args) {
        System.out.println("--- Генерация через Math.random() ---");
        double[] arrayMath = new double[5];
        for (int index = 0; index < arrayMath.length; index++) {
            arrayMath[index] = Math.random() * 100;
        }
        System.out.println("До сортировки: " + Arrays.toString(arrayMath));
        Arrays.sort(arrayMath);
        System.out.println("После сортировки: " + Arrays.toString(arrayMath));

        System.out.println("\n--- Генерация через класс Random ---");
        double[] arrayRandom = new double[5];
        Random randomGenerator = new Random();
        for (int index = 0; index < arrayRandom.length; index++) {
            arrayRandom[index] = randomGenerator.nextDouble() * 100;
        }
        System.out.println("До сортировки: " + Arrays.toString(arrayRandom));
        Arrays.sort(arrayRandom);
        System.out.println("После сортировки: " + Arrays.toString(arrayRandom));
    }
}