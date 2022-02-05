package code.basicprogram;

import java.util.Scanner;

public class Program55 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int i;
        int diffrence=0;
        boolean isSumOfPrime = false;
        int startIndex = (number/2)+1;
        for(i=startIndex;i>=2 && (!isSumOfPrime);i--) { //5
           if(isPrimeNumber(i)) {
               diffrence = number-i;
               if(isPrimeNumber(diffrence) && diffrence!=i) {
                   isSumOfPrime = true;
               }
           }

        }
        if(isSumOfPrime) {
            System.out.println("Sum of two prime number");
            System.out.println(diffrence);
        }
        else {
            System.out.println("Not a sum of two prime number");
        }
    }
    public static boolean isPrimeNumber(int number) {
        int i;
        boolean flag = true;
        for(i=2;i<=number/2 && flag;i++) {
            if(number%i == 0) {
                flag = false;
            }
        }
        return flag;

    }
}
