package L01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class L02_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = input.length-1; i >= 0; i--) {
            stack.push(input[i]);
        }
        int evaluation=Integer.parseInt(stack.pop());
        while (!stack.isEmpty()){
            if(stack.pop().equals("+")){
                evaluation=evaluation+Integer.parseInt(stack.pop());

            }
            else {evaluation=evaluation-Integer.parseInt(stack.pop());}
        }
        System.out.println(evaluation);

    }
}
