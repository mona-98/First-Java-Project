package code.basicprogram;

import java.util.Scanner;

public class Program43 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int i = 2;
        int lcm = (num1<num2)?num1:num2;
        while(true) {
            if(lcm%num1 == 0 && lcm%num2 ==0) {
                System.out.println(lcm);
                break;
            }
            lcm++;
        }

    }
}
