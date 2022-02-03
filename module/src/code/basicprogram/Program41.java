package code.basicprogram;

import java.util.Scanner;

public class Program41 {
    public static void main(String[] Args) {
        Scanner scan = new Scanner(System.in);
        int prev;
        int next;
        int lastNumber;
        int result;
        int i;
        lastNumber = scan.nextInt();
         prev =0;
         next = 1;
        System.out.println(prev);
        System.out.println(next);
        for(i=3;i<=lastNumber;i++) {
            result =prev+next;
            System.out.println(result);
            prev = next;
            next = result;
        }
    }
}
