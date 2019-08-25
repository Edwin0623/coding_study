package Jun1;

import java.util.Scanner;


public class factorial {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);

        System.out.print("Enter an positive Integer(n): ");
        int n = A.nextInt();
        int result = 1;

        if (n < 1) {
            System.out.println("This is not an positive Integer");
        } else {
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
            System.out.println(n + "! = " + result);
        }
    }
}

