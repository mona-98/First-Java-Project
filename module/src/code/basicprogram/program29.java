package code.basicprogram;

import java.util.Scanner;

public class program29 {
    public static void main(String[] Args) {
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        int divider =scan.nextInt();
        int quotient = value/divider;
        int remainder = value%divider;
        System.out.println("quotient of the value is " +quotient+ " remainder of the value is " +remainder);

    }
}
