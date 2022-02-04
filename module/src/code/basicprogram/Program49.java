package code.basicprogram;
import java.util.Scanner;
public class Program49 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number =scan.nextInt();
        int i;
        boolean flag=true;
           i=2;
           while(i<=number/2 && flag) {
               if(number%i == 0) {
                   flag=false;
               }
               i++;
           }

        if(flag) {
            System.out.println(number+" is a prime number");
        }
        else {
            System.out.println(number+" is not a prime number");
        }
    }
}
