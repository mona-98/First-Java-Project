package code.pattern;
import java.util.Scanner;
public class Pattern6 {
    public static void main(String[] Args) {
        int n;
        Scanner scan =new Scanner(System.in);
        int i,j;
        n = scan.nextInt();
        for(i=n;i>=1;i--){
            for(j=i;j<n;j++) {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
