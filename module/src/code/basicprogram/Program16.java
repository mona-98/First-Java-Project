package code.basicprogram;

import java.util.Scanner;

public class Program16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int  a = scan.nextInt();
        int b = scan.nextInt();
        float area = (float) (3.14 *(a+b)*(a-b));
        System.out.println(area);

    }
}
