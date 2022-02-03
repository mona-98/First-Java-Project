package code.basicprogram;

import java.util.Scanner;

public class Program40 {
    public static void main(String[] Args) {
        Scanner scan = new Scanner(System.in);
        int i;
        int number = scan.nextInt();
        int end = scan.nextInt();
        for(i=1;i<=end;i++) {
            System.out.println(i +" x " +number+" = "+i*number);
        }
    }
}
