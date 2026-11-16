package Tugas3;

import java.util.ArrayList;
import java.util.List;

public class TextStore {
    private final List<String> texts = new ArrayList<>();

    public void add(String text) {
        if (text != null && !text.trim().isEmpty()) {
            texts.add(text);
        }
    }

    public List<String> getAll() {
        return texts;
    }

    public boolean hasText() {
        return !texts.isEmpty();
    }
}
