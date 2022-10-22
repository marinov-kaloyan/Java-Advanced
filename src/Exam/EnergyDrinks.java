package Exam;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class EnergyDrinks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] milligramsOfCaffeine = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[] energyDrinks = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int totalCaffeine = 0;
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < milligramsOfCaffeine.length; i++) {
            stack.push(milligramsOfCaffeine[i]);
        }
        for (int i = 0; i < energyDrinks.length; i++) {
            queue.offer(energyDrinks[i]);
        }
      while (!stack.isEmpty()&&!queue.isEmpty()){
          if((stack.peek()*queue.peek()+totalCaffeine)<=300){
              totalCaffeine+=(stack.pop()*queue.poll());
          }
          else {
              stack.pop();
              int polled = queue.poll();
              queue.offer(polled);
              if (totalCaffeine<=30){totalCaffeine=0;}
              else {totalCaffeine-=30;}

          }


      }

      if(stack.isEmpty()&&!queue.isEmpty()){
          System.out.print("Drinks left: ");
          while (!queue.isEmpty()){
              if(queue.size()>1){
                  System.out.print(queue.poll()+", ");
              }
              else System.out.println(queue.poll());

          }
          }

      else {
          System.out.println("At least Stamat wasn't exceeding the maximum caffeine.");
      }

        System.out.println("Stamat is going to sleep with " +totalCaffeine+" mg caffeine.");

    }
}
