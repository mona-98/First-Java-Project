package code.basicprogram;

import java.util.Scanner;

public class Program53 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for subtraction");
        System.out.println("Enter 3 for Multiplication");
        System.out.println("Enter 4 for Divide");
        System.out.println("================================");
        byte option = scan.nextByte();
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int result;
        switch (option) {
            case 1:{
                result = number1+number2;
                System.out.println(result);
                break;
            }
            case 2:{
                result = number1-number2;
                System.out.println(result);
                break;
            }
            case 3:{
                result = number1*number2;
                System.out.println(result);
                break;
            }
            case 4:{
                result = number1/number2;
                System.out.println(result);
                break;
            }
            default:{
                System.out.println("Your option is wrong");
                break;
            }
        }
    }
}
