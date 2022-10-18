package E02_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class E02_MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int row = input[0];
        int col = input[1];

        String[][] matrix = fillMatrixPalindrome( row, col);
        printMatrix(row,col,matrix);


    }
    public static String[][] fillMatrixPalindrome(int row,int col){
        String[][] matrix = new String[row][col];
int i =0;
        for (int r = 0; r < matrix.length; r++) {
            for ( int c = 0; c < matrix[r].length; c++) {
                String palindrome = "";

                matrix[r][c]= palindrome+((char)(r+97))+((char)(c+i+97))+((char)(r+97));
            }
            i++;
        }

        return matrix;
    }
    public static void printMatrix(int row,int col,String[][] matrix){

        int[][] matrixToPrint = new int[row][col];
        for (int r = 0; r < matrixToPrint.length; r++) {
            for (int c = 0; c < matrixToPrint[r].length; c++) {
                System.out.print(matrix[r][c]+" ");

            }
            System.out.println();

        }

    }
}
