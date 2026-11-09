package prac3;

import java.util.Random;

public class Task3StrictlyIncreasing {
    public static void main(String[] args) {
        int[] randomArray = new int[4];
        Random randomGenerator = new Random();

        System.out.print("Массив: ");
        for (int index = 0; index < randomArray.length; index++) {
            randomArray[index] = randomGenerator.nextInt(90) + 10;
            System.out.print(randomArray[index] + " ");
        }
        System.out.println();

        boolean isStrictlyIncreasing = true;
        for (int index = 0; index < randomArray.length - 1; index++) {
            if (randomArray[index] >= randomArray[index + 1]) {
                isStrictlyIncreasing = false;
                break;
            }
        }

        if (isStrictlyIncreasing) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив НЕ является строго возрастающей последовательностью.");
        }
    }
}