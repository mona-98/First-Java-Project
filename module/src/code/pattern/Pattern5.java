package code.pattern;
import java.util.Scanner;
public class Pattern5 {
    public static void main(String[] Args) {
        Scanner scan =new Scanner(System.in);
        int i,j,n;
        int k;
        n = scan.nextInt();
        for(i=n;i>=1;i--) {

            for(j=0;j<i;j++) {
                System.out.print(" ");
            }
            for(j=i;j<=n;j++) {
                System.out.print(j);
            }
            k=n;
            for(j=0;j<n-i;j++) {
               System.out.print(--k);
            }
            System.out.println();

        }
    }
}
