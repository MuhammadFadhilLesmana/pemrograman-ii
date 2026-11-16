package Tugas3;

import java.util.Scanner;

public abstract class BasePage implements Page {
    private final String title;
    private final Scanner scanner;

    public BasePage(String title, Scanner scanner) {
        this.title = title;
        this.scanner = scanner;
    }

    @Override
    public String getTitle() {
        return title;
    }

    protected String ask(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
}
