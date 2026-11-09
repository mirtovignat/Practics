package prac2;

public class CircleTest {
    public static void main(String[] args) {
        Circle2 c1 = new Circle2(5.0);
        Circle2 c2 = new Circle2(7.0);

        System.out.println("Площадь c1: " + c1.getArea());
        System.out.println("Длина c1: " + c1.getLength());
        System.out.println("c1 больше c2? " + c1.compare(c2));
    }
}