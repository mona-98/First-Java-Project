package code.basicprogram;
import java.util.Scanner;
public class Program28 {
    public static void main(String[] Args) {
        Scanner scan = new Scanner(System.in);
        char ch = scan.next().charAt(0);
        int asciiValue = ch;
        System.out.print("Ascii value of "+ch+" is " +asciiValue);

    }
}
