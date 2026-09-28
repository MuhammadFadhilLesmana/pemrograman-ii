package Module1;

import java.util.Scanner;

public class PRAK104_2510817110006_MuhammadFadhilLesmana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tangan Abu: ");
        String[] abu = new String[3];
        for (int i = 0; i < 3; i++) {
            abu[i] = input.next();
        }

        System.out.print("Tangan Bagas: ");
        String[] bagas = new String[3];
        for (int i = 0; i < 3; i++) {
            bagas[i] = input.next();
        }

        int pointAbu = 0;
        int pointBagas = 0;

        for (int i = 0; i < 3; i++) {
            if (abu[i].equals(bagas[i])) {
                continue;
            }
            else if ((abu[i].equals("B") && bagas[i].equals("G")) ||
                    (abu[i].equals("G") && bagas[i].equals("K")) ||
                    (abu[i].equals("K") && bagas[i].equals("B"))) {
                pointAbu++;
            }
            else {
                pointBagas++;
            }
        }

        if (pointAbu > pointBagas) {
            System.out.println("Abu");
        } else if (pointBagas > pointAbu) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }
        input.close();
    }
}
