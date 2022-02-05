package code.basicprogram;

import java.util.Scanner;

public class Program59 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b =sc.nextInt();
        int gcd = findGcd(a,b);
        System.out.println(gcd);
    }
    public static int findGcd(int a,int b) {
        return findGcd(a,b,2);
    }
    public static int findGcd(int a,int b,int f) {
        if(f>a || f>b) {
            return 1;
        }
        if(a%f == 0 && b%f == 0) {
            a =a/f;
            b =b/f;
            return f*findGcd(a,b,f);
        }
        return findGcd(a,b,f+1);
    }
}
