package E02_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class E04_MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
         int row = input[0];
         int col = input[1];
         int [][] matrix = new int[row][col];
         for (int i = 0; i < row; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[i]=arr;
        }

         int maxSum = maxSum(matrix);
         int[][] max3by3Matrix = maxSumMatrix(matrix);

        System.out.println("Sum = "+maxSum);
        printMatrix(3,3, max3by3Matrix);

    }
    public static int maxSum(int [][]inputMatrix){
        int[][] matrix = inputMatrix;
        int[][] maxSumMatrix = new int[3][3];
        int maxSum =Integer.MIN_VALUE;
        for (int r = 0; r <matrix.length-2 ; r++) {
            for (int c = 0; c < matrix[r].length-2; c++) {
                int sumMatrix3by3 = matrix[r][c]+matrix[r][c+1]+matrix[r][c+2]+
                        matrix[r+1][c]+ matrix[r+1][c+1]+matrix[r+1][c+2]+
                        matrix[r+2][c]+ matrix[r+2][c+1]+matrix[r+2][c+2];
            if(sumMatrix3by3>maxSum){maxSum=sumMatrix3by3;
                maxSumMatrix= new int[][]{{matrix[r][c], matrix[r][c + 1], matrix[r][c + 2]},
                        {matrix[r + 1][c], matrix[r + 1][c + 1], matrix[r + 1][c + 2]},
                        {matrix[r + 2][c], matrix[r + 2][c + 1], matrix[r + 2][c + 2]}};
            }
        }



    }
        return maxSum;
}
    public static int[][] maxSumMatrix(int [][]inputMatrix){
        int[][] matrix = inputMatrix;
        int[][] maxSumMatrix = new int[3][3];
        int maxSum =Integer.MIN_VALUE;
        for (int r = 0; r <matrix.length-2 ; r++) {
            for (int c = 0; c < matrix[r].length-2; c++) {
                int sumMatrix3by3 = matrix[r][c]+matrix[r][c+1]+matrix[r][c+2]+
                        matrix[r+1][c]+ matrix[r+1][c+1]+matrix[r+1][c+2]+
                        matrix[r+2][c]+ matrix[r+2][c+1]+matrix[r+2][c+2];
                if(sumMatrix3by3>maxSum){maxSum=sumMatrix3by3;
                    maxSumMatrix= new int[][]{{matrix[r][c], matrix[r][c + 1], matrix[r][c + 2]},
                            {matrix[r + 1][c], matrix[r + 1][c + 1], matrix[r + 1][c + 2]},
                            {matrix[r + 2][c], matrix[r + 2][c + 1], matrix[r + 2][c + 2]}};
                }
            }



        }
        return maxSumMatrix;
    }
    public static void printMatrix(int row,int col,int [][] matrix){

        int[][] matrixToPrint = new int[row][col];
        for (int r = 0; r < matrixToPrint.length; r++) {
            for (int c = 0; c < matrixToPrint[r].length; c++) {
                System.out.print(matrix[r][c]+" ");

            }
            System.out.println();

        }

    }


}
