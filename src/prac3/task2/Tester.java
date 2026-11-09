package prac3;

import java.util.Random;

public class Tester {
    private final Circle[] circlesArray;
    private int elementsCount;

    public Tester(int size) {
        circlesArray = new Circle[size];
        elementsCount = 0;
    }

    public void addCircle(Circle circle) {
        if (elementsCount < circlesArray.length) {
            circlesArray[elementsCount++] = circle;
        }
    }

    public Circle findSmallestCircle() {
        if (elementsCount == 0) return null;
        Circle smallest = circlesArray[0];
        for (int index = 1; index < elementsCount; index++) {
            if (circlesArray[index].getRadius() < smallest.getRadius()) {
                smallest = circlesArray[index];
            }
        }
        return smallest;
    }

    public Circle findLargestCircle() {
        if (elementsCount == 0) return null;
        Circle largest = circlesArray[0];
        for (int index = 1; index < elementsCount; index++) {
            if (circlesArray[index].getRadius() > largest.getRadius()) {
                largest = circlesArray[index];
            }
        }
        return largest;
    }

    public void sortCirclesByRadius() {
        for (int outerIndex = 0; outerIndex < elementsCount - 1; outerIndex++) {
            for (int innerIndex = 0; innerIndex < elementsCount - 1 - outerIndex; innerIndex++) {
                if (circlesArray[innerIndex].getRadius() > circlesArray[innerIndex + 1].getRadius()) {
                    Circle temporaryCircle = circlesArray[innerIndex];
                    circlesArray[innerIndex] = circlesArray[innerIndex + 1];
                    circlesArray[innerIndex + 1] = temporaryCircle;
                }
            }
        }
    }

    public static void main(String[] args) {
        Tester tester = new Tester(5);
        Random randomGenerator = new Random();

        for (int index = 0; index < 5; index++) {
            double randomRadius = randomGenerator.nextDouble() * 10;
            Point randomPoint = new Point(randomGenerator.nextDouble() * 10, randomGenerator.nextDouble() * 10);
            tester.addCircle(new Circle(randomPoint, randomRadius));
        }

        System.out.println("Самая маленькая: " + tester.findSmallestCircle());
        System.out.println("Самая большая: " + tester.findLargestCircle());
        
        tester.sortCirclesByRadius();
        System.out.println("\nОтсортированные окружности:");
        for (int index = 0; index < tester.elementsCount; index++) {
            System.out.println(tester.circlesArray[index]);
        }
    }
}