package code.basicprogram;

import java.util.Scanner;

public class Program65 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows =scan.nextInt();
        int cols =scan.nextInt();
        int mat1[][] = new int [rows][cols];
        int mat2[][] = new int [rows][cols];
        int result[][]=new int [rows][cols];
        int i,j;
        for(i=0;i<rows;i++) {
            for(j=0;j<cols;j++) {
                mat1[i][j] = scan.nextInt();
            }
        }
        for(i=0;i<rows;i++) {
            for(j=0;j<cols;j++) {
                mat2[i][j] = scan.nextInt();
            }
        }
        for(i=0;i<rows;i++) {
            for(j=0;j<cols;j++) {
                result[i][j] = mat1[i][j]+mat2[i][j];
            }
        }
        for(i=0;i<rows;i++) {
            for(j=0;j<cols;j++) {
                System.out.println(result[i][j]);
            }
        }
    }
}
