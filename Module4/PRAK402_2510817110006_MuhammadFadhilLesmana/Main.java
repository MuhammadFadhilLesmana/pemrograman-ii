package Module4.PRAK402_2510817110006_MuhammadFadhilLesmana;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama Hewan Peliharaan: ");
        String petName = input.nextLine();
        System.out.print("Ras: ");
        String petBreed = input.nextLine();

        Pet pet = new Pet(petName, petBreed);
        pet.display();
    }
}
