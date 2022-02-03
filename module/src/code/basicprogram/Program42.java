package code.basicprogram;
import java.util.Scanner;
public class Program42 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int smallValue = (n1<n2)?n1:n2;
        if(n1/smallValue==0 && n2/smallValue==0) {
            System.out.println("The GCD of "+n1+"and "+n2 +"is" +smallValue);
        }
        else {
            int i = 2;
            int temp1=n1;
            int temp2=n2;
            int result = 1;
            while(i<=smallValue/2) {
                if(temp1%i==0 && temp2%i==0) {
                    result =result*i;
                    temp1=temp1/i;
                    temp2 =temp2/i;
                }
                else {
                    i++;
                }
            }
            System.out.println(result);
        }

    }
}
