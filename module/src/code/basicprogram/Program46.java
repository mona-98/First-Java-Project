package code.basicprogram;

import java.util.Scanner;

public class Program46 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int number = scan.nextInt();
        int i =0;
        int rev =0;
        while(number!=0) {
            int remainder =number%10;
             rev = rev*10+remainder;
            number=number/10;
        }
        System.out.println(rev);

    }
}
