package E02_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class E03_DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            int [] row = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
             matrix[i]=row;
        }

        int difference = Math.abs(primaryDiagonalSum(matrix)-secondaryDiagonalSum(matrix));
        System.out.println(difference);



    }

    public static int primaryDiagonalSum( int [][]matrix){
        int sum =0;
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if(r==c) sum+=matrix[r][c];
            }

        }
        return sum;
    }
    public static int secondaryDiagonalSum( int [][]matrix){
        int sum =0;
        for (int r = 0; r < matrix.length; r++) {
            for (int c = matrix[r].length-1; c >=0; c--) {
                if(c==matrix[r].length-1-r) sum+=matrix[r][c];
            }

        }
        return sum;
    }


}
