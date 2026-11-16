package Tugas3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private final List<Page> pages = new ArrayList<>();
    private final Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    public void add(Page page) {
        pages.add(page);
    }

    public Page get(int index) {
        return pages.get(index);
    }

    public int choose() {
        while (true) {
            System.out.println("\n--- MAIN MENU ---");
            for (int i = 0; i < pages.size(); i++) {
                System.out.println((i + 1) + ". " + pages.get(i).getTitle());
            }
            System.out.println("0. Exit");
            System.out.print("Choose option: ");
            try {
                int n = Integer.parseInt(scanner.nextLine().trim());
                if (n >= 0 && n <= pages.size()) {
                    return n;
                }
            } catch (NumberFormatException e) {
            }
            System.out.println("Invalid choice. Please enter a valid number.");
        }
    }
}
