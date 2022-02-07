package code.basicprogram;

import java.util.Scanner;

public class Program60 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long binaryNumber = scan.nextLong();
        long decimalResult=binaryToDecimal(binaryNumber);
        System.out.println(decimalResult);
        long decimalNumber = scan.nextLong();
        long binaryResult = decimalToBinary(decimalNumber);
        System.out.println(binaryResult);
    }
    public static long binaryToDecimal(long n) {
        int power = 0;
        double result =0;
        while(n!=0) {
           int integerVal = (int) n;
           int rem = integerVal%10;
           result = result+rem*Math.pow(2,power);
           power++;
           n =n/10;
        }
        long output = (long)result;
        return output;
    }
    public  static long decimalToBinary(long n) {
        long result =0;
        int f = 1;
        while(n!=0) {
            int integerVal = (int) n;
            int rem = integerVal%2;
            result = result+(rem*f);
            f = f *10;
            n = n/2;
        }
        return result;
    }

}
