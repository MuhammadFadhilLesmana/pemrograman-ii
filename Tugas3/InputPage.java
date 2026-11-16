package Tugas3;

import java.util.Scanner;

public class InputPage extends BasePage {
    private final TextStore store;

    public InputPage(Scanner scanner, TextStore store) {
        super("Input Text", scanner);
        this.store = store;
    }

    @Override
    public void show() {
        String input = ask("Enter text: ");
        store.add(input);
        System.out.println("Text saved successfully!");
    }
}
