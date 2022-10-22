package Exam;

import java.util.Arrays;
import java.util.Scanner;

public class RallyRacing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        String racingNumber= scanner.nextLine();
        String [][] matrix = new String[size][size];
        for (int r = 0; r < size; r++) {
            matrix[r]=scanner.nextLine().split("\\s+");
            }
        int totalDistance = 0;
        int carRow =0;
        int carCol=0;
        matrix[carRow][carCol]="C";
        boolean finished = false;
        String command = scanner.nextLine();
        while (!command.equals("End")){
            matrix[carRow][carCol]=".";
            if (command.equals("right") && carCol != size - 1) {
                carCol++;
            } else if (command.equals("left") && carCol != 0) {
                carCol--;
            } else if (command.equals("down") && carRow != size - 1) {
                carRow++;
            } else if (command.equals("up") && carRow != 0) {
                carRow--;
            }



            if(matrix[carRow][carCol] .equals("T")){
                matrix[carRow][carCol]=".";
                for (int r = 0; r < size; r++) {
                    for (int c = 0; c < size; c++) {
                        if(matrix[r][c].equals("T")){
                            carRow=r;
                            carCol=c;
                        }
                    }
                }
                totalDistance+=30;

            } else if (matrix[carRow][carCol].equals("F")){
                matrix[carRow][carCol]="C";
                totalDistance+=10;
                System.out.println("Racing car "+ racingNumber+" finished the stage!");
                finished = true;
                break;
            }else {
                totalDistance+=10;

        }
 matrix[carRow][carCol]="C";

command= scanner.nextLine();

        }
        if(!finished){
            System.out.println("Racing car "+ racingNumber+" DNF.");
        }
        System.out.println("Distance covered "+totalDistance+" km.");

        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                System.out.print(matrix[r][c]);
            }
            System.out.println();
        }


        }
    }

