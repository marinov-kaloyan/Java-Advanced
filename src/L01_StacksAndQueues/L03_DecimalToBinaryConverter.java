package L01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class L03_DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        int start = input;
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        if(start==0){
            System.out.println(start);
        }
        while (start!=0){
            stack.push(start%2);
            start=start/2;
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
