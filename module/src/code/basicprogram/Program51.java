package code.basicprogram;

import java.util.Scanner;

public class Program51 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int startingPoint = scan.nextInt();
        int endingPoint = scan.nextInt();
        int i;
        for(i=startingPoint;i<=endingPoint;i++) {
            int value = getArmstrongNumber(i);
            if (value == i ) {
                System.out.println(i);
            }
        }
    }
    public static int getArmstrongNumber(int number) {
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
                i++;
            }
            armstrongNumber = armstrongNumber + tempValue;
            number = number / 10;
        }
        return armstrongNumber;
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
