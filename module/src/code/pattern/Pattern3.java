package code.pattern;
import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] Args) {
        Scanner scan =new Scanner(System.in);
        int i,j,n;
        n = scan.nextInt();
        for(i=0;i<n;i++) {
            for(j=0;j<(n-i);j++) {
                System.out.print(" ");
            }
            for(j=0;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
