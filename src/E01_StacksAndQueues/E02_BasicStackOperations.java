package E01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class E02_BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      String [] input  =scanner.nextLine().split(" ");
      int countToPush = Integer.parseInt(input[0]);
      int countToPop = Integer.parseInt(input[1]);
      int elementToSearch = Integer.parseInt(input[2]);

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        String [] numbersToAdd = scanner.nextLine().split(" ");
        for (int i = 0; i < countToPush; i++) {
            stack.push(Integer.parseInt(numbersToAdd[i]));
        }
        for (int i = 0; i < countToPop; i++) {
            stack.pop();
        }



        if (stack.contains(elementToSearch)){
            System.out.println("true");
        }
        else   if(stack.isEmpty()) {System.out.println(0);}
        else System.out.println(Collections.min(stack));

    }
}
