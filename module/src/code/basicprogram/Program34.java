package code.basicprogram;

import java.util.Scanner;

public class Program34 {
    public static void main(String[] Args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int value = (a>b)?a:b;
        value =(value>c)?value:c;
        System.out.println("The biggest value is "+value);
    }
}
