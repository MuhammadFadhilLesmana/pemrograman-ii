package Tugas3;

import java.util.Scanner;

public class App {
    private final Menu menu;

    public App() {
        Scanner scanner = new Scanner(System.in);
        TextStore store = new TextStore();
        menu = new Menu(scanner);
        menu.add(new InputPage(scanner, store));
        menu.add(new DisplayPage(scanner, store));
    }

    public void run() {
        int choice;
        while ((choice = menu.choose()) != 0) {
            System.out.println();
            menu.get(choice - 1).show();
        }
        System.out.println("Goodbye!");
    }
}
