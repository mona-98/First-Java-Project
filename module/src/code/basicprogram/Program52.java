package code.basicprogram;

import java.util.Scanner;

public class Program52 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        boolean flag = false;
        int i =2;
        while(i<number) {
            if(number%i == 0) {
                System.out.println(i);
                flag = true;
            }
            i++;
        }
        if(!flag) {
            System.out.println("No Factor");
        }
    }
}
