package code.pattern;
import java.util.Scanner;
public class Pattern4 {
    static int k;
    public static void main(String[] Args) {
        Scanner scan = new Scanner(System.in);
        int i,j,n;
        n = scan.nextInt();
        for (i=1;i<=n;i++) {
            for(j=i;j<n;j++) {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++) {
                System.out.print(j);

            }
            k=j;
            for(j=k-2;j>=1;j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
