package Module4.PRAK402_2510817110006_MuhammadFadhilLesmana;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama Hewan Peliharaan: ");
        String petName = input.nextLine();
        System.out.print("Ras: ");
        Pet myPet = new Pet("Kucing Anggora", "Leo");
        String petBreed = input.nextLine();

        Pet pet = new Pet(petName, petBreed);
        pet.display();
    }
}
