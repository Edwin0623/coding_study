package Jun1;

import java.util.Scanner;

public class homeWork5 {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        System.out.print("Enter an positive Integer: ");
        int n = A.nextInt();
        int m = n;

        if (n < 1) {
            System.out.println("Error: " + n + " is not an positive Integer.");
        } else {
            System.out.println("n = " + n);
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = m; k >= 1; k--) {
                System.out.print("*");
            }
            m = m - 1;
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
