package Jun1;

import java.util.Scanner;

public class homeWork2 {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        System.out.println("Hello. This is for practicing For-loop function.");
        System.out.print("Enter an positive Integer: ");
        int n = A.nextInt();

        if (n < 1) {
            System.out.println("Error: " + n + " is not an positive Integer.");
        } else {
            System.out.println("n = " + n);
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k > 0; k--) {
                System.out.print(k);
            }
            System.out.println();
        }
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = n - i; k > 0; k--) {
                System.out.print(k);
            }
            System.out.println();
        }

    }
}

