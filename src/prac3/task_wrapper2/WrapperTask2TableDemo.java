package prac3;

public class WrapperTask2TableDemo {
    public static void main(String[] args) {
        System.out.println("Byte: " + Byte.toString((byte) 10));
        System.out.println("Integer: " + Integer.toString(255, 16));
        System.out.println("Long: " + Long.parseLong("100", 2));
        System.out.println("Short: " + Short.valueOf("20"));
        System.out.println("Double: " + Double.valueOf("3.14"));
        System.out.println("Float: " + Float.parseFloat("2.71"));
        System.out.println("Character: " + Character.toString('A'));
        System.out.println("Boolean: " + Boolean.parseBoolean("true"));
    }
}