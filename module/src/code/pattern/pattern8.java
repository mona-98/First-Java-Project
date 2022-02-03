package code.pattern;

import java.util.Scanner;

public class pattern8 {
    public static void main(String[] Args) {
        int n;
        Scanner scan = new Scanner(System.in);
        int i, j;
        n = scan.nextInt();
        for (i = n; i >= 1; i--) {
            for (j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (i = 1; i <= n; i++) {
            for (j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
