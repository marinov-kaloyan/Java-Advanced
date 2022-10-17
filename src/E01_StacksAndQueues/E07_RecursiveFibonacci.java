package E01_StacksAndQueues;

import java.util.Scanner;

public class E07_RecursiveFibonacci {
    public static long[] memory;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        memory = new long[n+1];
        System.out.println(recursiveFibonacci(n));
    }
    public static long recursiveFibonacci(int n){
        if(n<2)return 1;
        if(memory[n]!=0){
            return memory[n];
        }
        memory[n]=(recursiveFibonacci(n-1)+recursiveFibonacci(n-2));
        return memory[n];
    }
}
