package code.basicprogram;

import java.util.Scanner;
public class Program38 {
    public static void main(String[] Args) {
        Program38 program38 = new Program38();
        int sum=0;
        int value;
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        sum = (number+1)*number/2;
        System.out.println(sum);
        value =program38.calculateNaturalSum( number ); // this method is for calculate sum using loop
        System.out.println(value);
    }
    public int calculateNaturalSum(int val) {
        int i;
        int value = 0;
        for(i=0;i<=val;i++) {
             value = value + i;
        }
        return value;
    }
}
