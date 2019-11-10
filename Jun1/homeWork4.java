package Jun1;

import java.util.Scanner;

public class homeWork4 {
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
            for (int j = m; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
           m = m - 1; // 마지막 m = 0
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = m + 2; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
            m = m + 1;
        }
    }
}
