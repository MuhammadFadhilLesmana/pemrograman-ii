package Module2.PRAK201_2510817110006_MuhammadFadhilLesmana;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Fruit apple = new Fruit("Apel", 0.4, 7000.0, 40.0);
        Fruit mango = new Fruit("mangga", 0.2, 3500.0, 15.0);
        Fruit avocado = new Fruit("alpukat", 0.25, 10000.0, 12.0);

        apple.printInfo();
        mango.printInfo();
        avocado.printInfo();
    }
}

