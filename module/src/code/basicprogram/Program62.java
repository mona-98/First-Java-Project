package code.basicprogram;

import java.util.Scanner;

public class Program62 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long binaryNumber = scan.nextInt();
        long octOutput=binaryToOctal(binaryNumber);
        long octalNumber = scan.nextLong();
        long binOutput = octalToBinary(octalNumber);
        System.out.println(octOutput);
        System.out.println(binOutput);
    }
    public static long binaryToOctal(long n) {
        int oct = 0, dec = 0, i = 0;

        while (n != 0) {
            dec += (n % 10) * Math.pow(2, i);
            ++i;
            n /= 10;
        }
        i = 1;
        while (dec != 0) {
            oct += (dec % 8) * i;
            dec /= 8;
            i *= 10;
        }
        return oct;

    }

    public static long octalToBinary(long n) {
        int dec = 0, i = 0;
         long bin = 0;
        while (n != 0) {
            dec += (n % 10) * Math.pow(8, i);
            ++i;
            n /= 10;
        }
        i = 1;
        while (dec != 0) {
            bin += (dec % 2) * i;
            dec /= 2;
            i *= 10;
        }
        return bin;
    }
}
