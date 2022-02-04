package code.basicprogram;

import java.util.Scanner;

public class Program54 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int startingPoint = scan.nextInt();
        int endingPoint = scan.nextInt();
        int i;
        Program54 pgm = new Program54();
        for(i=startingPoint;i<=endingPoint;i++) {
           boolean value =pgm.getPrimeNumber(i);
           if(value) {
               System.out.println(i);
           }
        }
    }
    public boolean getPrimeNumber(int number) {
        int i;
        boolean flag = true;
         if(number == 1) {
             flag = false;
         }
         else if (number>2) {
            for(i=2;i<=number/2;i++) {
                if(number%i==0) {
                    flag = false;
                }
            }
        }
        return flag;

    }
}
