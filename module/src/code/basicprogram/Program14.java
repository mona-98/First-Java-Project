package code.basicprogram;

import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double radius = scan.nextDouble();
        double height = scan.nextDouble();
        double area = (2.0 *3.14 *radius*height) + (2.0 *3.14 *radius*radius);
        System.out.print(area);
    }
}
