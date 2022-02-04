package code.basicprogram;

import java.sql.SQLOutput;

public class Program20 {
    public static void main(String[] args) {
        int i =10;
        int j =5;
        int postIncrement =i++;
        int preIncrement =++i;
        int postDecrement = j--;
        int preDecrement =--j;
        System.out.println(postIncrement);
        System.out.println(preIncrement);
        System.out.println(postDecrement);
        System.out.println(preDecrement);

    }
}
