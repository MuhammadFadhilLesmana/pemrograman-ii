package Module1;

import java.util.Scanner;

public class PRAK102_2510817110006_MuhammadFadhilLesmana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input: ");
        int number = input.nextInt();

        System.out.print("Output: ");
        int calculation = 0;

        while (calculation <= 10) {
            if (number % 5 == 0) {
                System.out.print((number / 5) - 1);
            } else {
                System.out.print(number);
            }
            if (calculation < 10) {
                System.out.print(", ");
            }

            number++;
            calculation++;
        }
        input.close();
    }
}