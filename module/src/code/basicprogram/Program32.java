package code.basicprogram;

import java.util.Scanner;

public class Program32 {
    public static void main(String[] Args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
       if (number%2 == 0) {
           System.out.println(number+" is even");
       }
       else {
           System.out.println(number+" is odd");
       }

    }
}
