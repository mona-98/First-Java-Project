package code.pattern;
import java.util.Scanner;
public class Pattern2 {
    public static void main(String[] Args) {
        int i,j;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(i=1;i<=n;i++) {
            for(j=1;j<=(n-i);j++) {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
