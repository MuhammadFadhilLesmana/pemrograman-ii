package Tugas3;

import java.util.List;
import java.util.Scanner;

public class DisplayPage extends BasePage {
    private final TextStore store;

    public DisplayPage(Scanner scanner, TextStore store) {
        super("Display Text List", scanner);
        this.store = store;
    }

    @Override
    public void show() {
        if (store.hasText()) {
            System.out.println("--- Entered Text History ---");
            List<String> allTexts = store.getAll();
            for (int i = 0; i < allTexts.size(); i++) {
                System.out.println((i + 1) + ". " + allTexts.get(i));
            }
        } else {
            System.out.println("No text found.");
        }
    }
}
