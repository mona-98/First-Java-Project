package code.basicprogram;

import java.util.Scanner;

public class Program66 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows =scan.nextInt();
        int cols =scan.nextInt();
        int rows1 =scan.nextInt();
        int cols1=scan.nextInt();
        int mat1[][] = new int [rows][cols];
        int mat2[][] = new int [rows][cols];
        int result[][]=new int [rows][cols];
        int i,j,k;
        if(rows!=cols1) {
            System.out.println("rows of first matrix and cols of second matrix is not equal");
            return;
        }
        for(i=0;i<rows;i++) {
            for(j=0;j<cols;j++) {
                mat1[i][j] = scan.nextInt();
            }
        }
        for(i=0;i<rows1;i++) {
            for(j=0;j<cols1;j++) {
                mat2[i][j] = scan.nextInt();
            }
        }

        for(i=0;i<rows;i++) {
            for(j=0;j<cols1;j++) {
                result[i][j] = 0;
                for(k=0;k<rows1;k++) {
                    result[i][j]  += mat1[i][k] * mat2[k][j];
                }
            }
        }

        for(i=0;i<rows1;i++) {
            for(j=0;j<cols1;j++) {
                System.out.println(result[i][j]);
            }
        }
    }
}
