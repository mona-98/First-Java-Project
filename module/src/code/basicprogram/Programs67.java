package code.basicprogram;

import java.util.Scanner;

public class Programs67 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows =scan.nextInt();
        int cols =scan.nextInt();
        int mat[][] = new int [rows][cols];
        int result[][] = new int [cols][rows];
        int i,j;
        for(i=0;i<rows;i++) {
            for(j=0;j<cols;j++) {
                mat[i][j] = scan.nextInt();
            }
        }
        for(i=0;i<cols;i++) {
            for(j=0;j<rows;j++) {
                result[i][j] = mat[j][i];
            }
        }

        for(i=0;i<cols;i++) {
            for(j=0;j<rows;j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }

    }
}
