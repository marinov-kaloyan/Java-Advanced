package E01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class E01_ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        ArrayDeque<String> stack = new ArrayDeque<>();
        for (int i = 0; i <input.length ; i++) {
            stack.push(input[i]);
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }

    }
}
