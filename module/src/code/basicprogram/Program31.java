package code.basicprogram;

import java.util.Scanner;

public class Program31 {
    public static void main(String[] Args) {
        Scanner scan = new Scanner(System.in);
        int number1,number2;
        number1 = scan.nextInt();
        number2 = scan.nextInt();
        number1= number1^number2;
        number2=number1^number2;
        number1=number1^number2;
        System.out.println("After Swaping " +number1+ " " +number2);
    }
}
