package code.basicprogram;

import java.util.Scanner;

public class Program55 {
    public static  void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        boolean armstrongFlag = isArmstrong(number);
        if(armstrongFlag) {
            System.out.println("Armstrong number");
        }
        else {
            System.out.println("Not Armstrong");
        }
        boolean primeFlag = isPrime(number);
        if(primeFlag) {
            System.out.println("Prime Number");
        }
        else {
            System.out.println("Not Prime");
        }
    }
    public static boolean isArmstrong(int n) {
        int count = countDigit(n);
        double result = 0;
        int originalNumber = n;
        while(n!=0) {
            int rem = n%10;
            result = result + Math.pow(rem,count);
            n = n/10;
        }
        int output = (int) result;
        if(originalNumber == output) {
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean isPrime(int n) {
        int i;
        boolean flag = true;
        for(i =2;i<=(n/2) && flag;i++) {
                if(n%i == 0) {
                    flag = false;
                }
        }
        return flag;

    }
    public static int countDigit(int n) {
        int count = 0;
        while(n!=0) {
            count++;
            n = n/10;
        }
        return count;
    }
}
