package Module1;

import java.util.Scanner;
import java.util.Locale;

public class PRAK105_2510817110006_MuhammadFadhilLesmana {
    public static final double PHI = 3.14;

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in).useLocale(Locale.US);

            System.out.print("Masukkan jari-jari: ");
            double fingers = input.nextDouble();

            System.out.print("Masukkan tinggi: ");
            double tall = input.nextDouble();

            double volume = PHI * fingers * fingers * tall;

            System.out.println("Volume tabung dengan jari-jari " + fingers +
                    " cm dan tinggi " + tall + " cm adalah " + volume + " m3");
            input.close();
        }
    }