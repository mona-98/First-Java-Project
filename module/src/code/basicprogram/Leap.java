package code.basicprogram;
import java.util.Scanner;
public class Leap {
    public static void main(String[] Args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        if ((year%400 == 0 || year%4 ==0)) {
            System.out.println(year +" is a leap year");
        }
        else  {
            System.out.println(year +" is not a leap year");
        }
    }
}
