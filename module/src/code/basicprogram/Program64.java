package code.basicprogram;

import java.util.Scanner;

public class Program64 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int number = scan.nextInt();
        int power = scan.nextInt();
        int result = findPower(number,power);
        System.out.println(result);
    }
    public static int findPower(int n,int p) {
        if(p==0) {
            return 1;
        }
        return n * findPower(n,p-1);
    }
}
