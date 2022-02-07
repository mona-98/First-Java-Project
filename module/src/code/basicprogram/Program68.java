package code.basicprogram;

public class Program68 {
    public static void main(String[] args) {
        matrixMultiplication(new int[][] {{1,2}},new int[][] {{1,2,3},{1,2,3}});
    }
    public static void matrixMultiplication(int a[][],int b [][]) {
        int i,j,k;
        int[][] result = new int[1][3];
        for(i=0;i<1;i++) {
            for(j=0;j<3;j++) {
                result[i][j] = 0;
                for(k=0;k<2;k++) {
                    result[i][j]  += a[i][k] * b[k][j];
                }
            }
        }
        for(i=0;i<1;i++) {
            for(j=0;j<3;j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }

    }
}
