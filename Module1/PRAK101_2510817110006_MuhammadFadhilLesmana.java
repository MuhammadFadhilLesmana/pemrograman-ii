package Module1;

import java.util.Scanner;

public class PRAK101_2510817110006_MuhammadFadhilLesmana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        String fullName = input.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String birthPlace = input.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        int dateofBirth = input.nextInt();

        System.out.print("Masukkan Bulan Lahir: ");
        int birthMonth = input.nextInt();

        System.out.print("Masukkan Tahun Lahir: ");
        int yearofBirth = input.nextInt();

        System.out.print("Masukkan Tinggi Badan: ");
        int height = input.nextInt();

        System.out.print("Masukkan Berat Badan: ");
        double weight = input.nextDouble();

        String monthName = "";
        switch (birthMonth) {
            case 1: monthName = "Januari"; break;
            case 2: monthName = "Februari"; break;
            case 3: monthName = "Maret"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "Mei"; break;
            case 6: monthName = "Juni"; break;
            case 7: monthName = "Juli"; break;
            case 8: monthName = "Agustus"; break;
            case 9: monthName = "September"; break;
            case 10: monthName = "Oktober"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "Desember"; break;
            default: monthName = "(Bulan tidak valid)"; break;
        }

        System.out.println("Nama Lengkap " + fullName + ", Lahir di " + birthPlace +
                " pada Tanggal " + dateofBirth + " " + monthName + " " + yearofBirth);
        System.out.println("Tinggi Badan " + weight + " cm dan Berat Badan " +
                height + " kilogram");
        input.close();
    }
}
