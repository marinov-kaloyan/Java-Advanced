package E05_FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class E01_ConsumerPrint {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Consumer <String> printer = System.out::println;
        Arrays.stream(console.nextLine().split("\\s+")).forEach(printer);
    }
}
