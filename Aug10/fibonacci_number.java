package Aug10;

import java.util.Scanner;

public class fibonacci_number {
    /*
        Fibonacci number: 0 1 1 2 3 5 8 13 21 34 ...
        input: n = 8
        output: 13
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an positive Integer: ");
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }
    public static int fibonacci(int n) {
        if (n <= 0) {
            System.out.println("Error: " + n + " is not an positive Integer.");
            return - 1;
        }
        if (n <= 2 && n > 0) {
            return n - 1;
        }
        int previous = 0;
        int current = 1;
        for (int i = 3; i <= n; i++) {
            int output = previous + current;
            previous = current;
            current = output;
        }
        return current;
    }
}

