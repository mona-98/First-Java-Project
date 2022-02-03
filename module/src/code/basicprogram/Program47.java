package code.basicprogram;
import java.util.Scanner;
import java.lang.Math;
public class Program47 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int power;
        int number;
        int i;
        int result =1;
        number = scan.nextInt();
        power =scan.nextInt();
        i=1;
        while(i<=power) {
            result = result*number;
            i++;
        }
        System.out.println(result);
        System.out.println(Math.pow(number,power)); // calculate power using build in function
    }
}
