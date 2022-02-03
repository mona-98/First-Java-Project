package code.basicprogram;

import java.util.Scanner;

public class Program37 {
    public static void main(String[] Args) {
        Scanner scan = new Scanner(System.in);
        char ch = scan.next().charAt(0);
        if ((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
            System.out.println(ch+" is a alphabet");
        }
        else {
            System.out.println(ch+" is not alphabet");
        }
    }
}
