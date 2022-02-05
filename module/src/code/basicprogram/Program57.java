package code.basicprogram;

public class Program57 {
    public static void main(String[] args) {
        int number = 10;
         int value = sumNaturalNumber(number);
        System.out.println(value);
    }
    public static int sumNaturalNumber(int n) {
        if(n==1) {
            return 1;
        }
        return n + sumNaturalNumber(n-1);

    }
}
