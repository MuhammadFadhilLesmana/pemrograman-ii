package Module1;

import java.util.Scanner;

public class PRAK103_2510817110006_MuhammadFadhilLesmana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input: ");
        int n = input.nextInt();
        int number = input.nextInt();

        System.out.print("Output: ");
        int calculation = 0;

        if (n > 0) {
            do {
                if (number % 2 != 0) {
                    System.out.print(number);
                    calculation++;

                    if (calculation < n) {
                        System.out.print(", ");
                    }
                }
                number++;
            } while (calculation < n);
        }
        input.close();
    }
}