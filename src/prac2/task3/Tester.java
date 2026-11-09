package prac2;

public class Tester {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(new Point(0, 0), 5.0);
        circles[1] = new Circle(new Point(1, 1), 2.5);
        circles[2] = new Circle(new Point(-1, -1), 10.0);

        int count = circles.length;
        System.out.println("Количество окружностей: " + count);
    }
}