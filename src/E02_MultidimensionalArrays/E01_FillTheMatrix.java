package E02_MultidimensionalArrays;

import java.util.Scanner;

public class E01_FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int n = Integer.parseInt(input[0]);
        String pattern = input[1];

       int [][] matrix= pattern.equals("A")? patternA(n):patternB(n);

        printMatrix(n,matrix);

    }
    public static int[][] patternA(int n){
        int[][] matrix = new int[n][n];
        int start = 1;
        for (int c = 0; c < matrix.length; c++) {
            for (int r = 0; r < matrix[c].length; r++) {
                matrix[r][c]=start;
                start++;
            }

        }
        return matrix;
    }
    public static int[][] patternB(int n){
        int[][] matrix = new int[n][n];
        int start = 1;
        for (int c = 0; c < matrix.length; c++) {
            if(c%2==0){
            for (int r = 0; r < matrix[c].length; r++) {
                matrix[r][c]=start;
                start++;
            }}
            if(c%2==1){
                for (int r = matrix[c].length-1; r >= 0; r--) {
                    matrix[r][c]=start;
                    start++;
                }
            }

        }
        return matrix;
    }

    public static void printMatrix(int n,int[][] matrix){

        int[][] matrixToPrint = new int[n][n];
        for (int r = 0; r < matrixToPrint.length; r++) {
            for (int c = 0; c < matrixToPrint[r].length; c++) {
                System.out.print(matrix[r][c]+" ");

            }
            System.out.println();

        }

    }

}
