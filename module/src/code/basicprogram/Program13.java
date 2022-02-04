package code.basicprogram;

import java.util.Scanner;

public class Program13 {
    public static void main(String[] main) {
        Scanner scan = new Scanner(System.in);
        float length = scan.nextFloat();
        float width = scan.nextFloat();
        float areaOfRectangle = length * width;
        System.out.print(areaOfRectangle);

    }
}
