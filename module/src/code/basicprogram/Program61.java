package code.basicprogram;

import java.util.Scanner;

public class Program61 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int octalNumber = scan.nextInt();
        int decimalResult = octalToDecimal(octalNumber);
        System.out.println(decimalResult);
        int decimalNumber = scan.nextInt();
        int octalResult = decimalToOctal(decimalNumber);
        System.out.println(octalResult);
    }
    public static int octalToDecimal(int n) {
        double result =0;
        int power = 0;
        while(n!=0) {
            int rem = n%10;
            result = result +rem * Math.pow(8,power);
            n = n/10;
            power++;
        }
        int output = (int) result;
        return output;
    }
    public static int decimalToOctal(int n) {
        long result =0;
        int f = 1;
        while(n!=0) {
            int rem = n%8;
            result = result+(rem*f);
            f = f *10;
            n = n/8;
        }
        int output = (int)result;
        return output;
    }
}
