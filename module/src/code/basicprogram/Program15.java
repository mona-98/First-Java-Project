package code.basicprogram;

import java.util.Scanner;

public class Program15 {
    public static  void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        double x1 = (-b + Math.sqrt(Math.pow(b,2) - (4*a*c)))/(2*a);
        double x2 = (-b - Math.sqrt(Math.pow(b,2) - (4*a*c)))/(2*a);
        if(x1 == x2) {
            System.out.println("x="+x1);
        }
        else {
            System.out.println("x="+x1+","+x2);
        }
    }
}
