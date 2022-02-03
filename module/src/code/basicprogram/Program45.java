package code.basicprogram;
import java.util.Scanner;
public class Program45 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int number = scan.nextInt();
        int i =0;
        while(number!=0) {
            number =number/10;
            i++;
        }
        System.out.println(i);

    }
}
