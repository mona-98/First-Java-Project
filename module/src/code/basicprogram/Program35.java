package code.basicprogram;
import java.util.Scanner;
public class Program35 {
    public static void main(String[] Strings)
    {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d= b * b - 4.0 * a * c;
        if (d> 0.0)
        {
            double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
            System.out.println(  r1 + " and " + r2 + " are the real roots");
        }
        else if (d == 0.0)
        {
            double r1 = -b / (2.0 * a);
            System.out.println(" root is " + r1);
        }
        else
        {
            System.out.println("Roots are not real");
        }
    }
}
