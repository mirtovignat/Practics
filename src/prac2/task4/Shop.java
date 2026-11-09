package prac2;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    private ArrayList<String> computers = new ArrayList<>();

    public void addComputer(String pc) {
        computers.add(pc);
    }

    public void removeComputer(String pc) {
        computers.remove(pc);
    }

    public boolean findComputer(String pc) {
        return computers.contains(pc);
    }

    public static void main(String[] args) {
        Shop shop = new Shop();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 компьютера для добавления:");
        for (int i = 0; i < 3; i++) {
            shop.addComputer(scanner.nextLine());
        }
        System.out.println("Введите компьютер для поиска:");
        String search = scanner.nextLine();
        if (shop.findComputer(search)) {
            System.out.println("Компьютер найден!");
        } else {
            System.out.println("Компьютер не найден.");
        }
        scanner.close();
    }
}