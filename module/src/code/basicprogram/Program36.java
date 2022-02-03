package code.basicprogram;

import java.util.Scanner;

public class Program36 {
    public static void main(String[] Args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        String value = (number==0)?"Neither positive Nor Negative":(number>0)?"Positive":"Negative";
        System.out.println("This is a " +value+ " Number");
    }
}
