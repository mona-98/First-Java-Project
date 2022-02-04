package code.basicprogram;

import java.util.Scanner;

public class Program17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        a = -a;
        System.out.println(a);
        int c =++b;
        int d =--b;
        int e =a++;
        int f =++a;
        int g =+20;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(-g);
        int number =10;
        int number1 =8;
        int result =++number1+ --number +number++; //
        System.out.println(result);
        System.out.println(+10 + -20 - -20+ 2); //
    }
}
