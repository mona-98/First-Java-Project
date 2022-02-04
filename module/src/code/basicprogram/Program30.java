package code.basicprogram;

import java.util.Scanner;

public class Program30 {
    public static void main(String[] args) {
        long number = 34545L;
        System.out.println(number);
        Scanner scan = new Scanner(System.in);
        long number1 = scan.nextLong();
        System.out.println(number1);
        long sum = number1+number;
        System.out.println(sum);
    }
}
