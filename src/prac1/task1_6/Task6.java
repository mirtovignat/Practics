package prac1;

public class Task6 {
    public static void main(String[] args) {
        System.out.printf("%-4s %-12s%n", "n", "H(n)");
        System.out.println("------------------");
        double h = 0.0;
        for (int n = 1; n <= 10; n++) {
            h += 1.0 / n;
            System.out.printf("%-4d %-12.6f%n", n, h);
        }
    }
}