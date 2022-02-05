package code.basicprogram;

import java.util.Scanner;

public class Program63 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String name = scan.nextLine();
        String revName = reverse(name);
        System.out.println(revName);
    }
    public static String reverse(String name) {
        if(name.length()<=1) {
            return name;
        }
        return name.charAt(name.length()-1) +reverse(name.substring(0,name.length()-1));
    }
}
