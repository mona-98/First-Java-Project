package code.basicprogram;

import java.util.Scanner;

public class Program50 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int originalNumber = number;
        int armstrongNumber = 0;
        int digit=countDigit(number);
        int i;
        while(number!=0) {
            int remainder =number%10;
            i=0;
            int tempValue = 1;
            while(i<digit) {
                tempValue = tempValue * remainder;
                System.out.println(tempValue);
                i++;
            }
            armstrongNumber = armstrongNumber + tempValue;
            number = number / 10;
        }
        if(armstrongNumber == originalNumber) {
            System.out.println("ArmstrongNumber");
        }
        else {
            System.out.println("Not ArmstrongNumber");
        }
    }
    public static int countDigit(int number) {
        int i = 0;
        while(number!=0) {
            number=number/10;
            i++;
        }
        return i;
    }
}
