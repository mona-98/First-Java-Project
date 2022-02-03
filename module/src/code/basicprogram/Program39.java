package code.basicprogram;

import java.util.Scanner;

public class Program39 {
    public static void main(String[] Args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int i;
        int fact=1;
        for(i=1;i<=number;i++) {
            fact = fact*i;
        }
        System.out.println("factorial of "+number+" is "+fact);
    }
}
