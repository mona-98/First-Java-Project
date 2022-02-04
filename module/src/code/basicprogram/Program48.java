package code.basicprogram;
import java.util.Scanner;
public class Program48 {
    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);
        number =scan.nextInt();
        int originalNumber=number;
        int rev =0;
        while(number!=0) {
           int remainder = number%10;
            rev =rev*10+remainder;
            number =number/10;
        }
        if(originalNumber == rev) {
            System.out.println(originalNumber+" is Palindrome");
        }
        else {
            System.out.println(originalNumber+" is not palindrome");
        }
    }
}
