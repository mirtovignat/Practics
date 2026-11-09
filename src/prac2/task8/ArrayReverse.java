package prac2;

public class ArrayReverse {
    public static void main(String[] args) {
        String[] arr = {"один", "два", "три", "четыре", "пять"};

        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        for (String s : arr) System.out.print(s + " ");
    }
}