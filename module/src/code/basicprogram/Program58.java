package code.basicprogram;

import java.util.Scanner;

public class Program58 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int fact = findFactorial(number);
        System.out.println(fact);
    }
    public static int findFactorial(int n) {
        if(n==1) {
            return 1;
        }
        return n *findFactorial(n-1);
    }
}
