package code.basicprogram;

import java.util.Scanner;

public class Program26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int km = scan.nextInt();//
        double miles = convertKmToMiles(km);
        float  centigrade = scan.nextFloat();//37 98.6
        double fahrenheit =  convertCentigradeToFahrenheit(centigrade);
        int squareFeet = scan.nextInt(); //17200
        double acre = convertSquareFeetToAcre(squareFeet);
        System.out.println(String.format("%.4f",miles));
        System.out.println(String.format("%.2f",fahrenheit));
        System.out.println(String.format("%.4f",acre));
    }

    public static double convertKmToMiles(int value) {
        double result = 0.62137 * value;
        return result;
    }

    public static double convertCentigradeToFahrenheit(float value) {
        double result = (value * 1.8 )+32;
        return result;
    }

    public static double convertSquareFeetToAcre(int value) {
        double result = value * 0.000022957;
        return result;
    }
}
