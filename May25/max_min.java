package May25;

import java.util.Scanner;
// Finding Max and Min Integer.
public class max_min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an positive Integer: ");
        int n = sc.nextInt();
        int max = 0;
        int min = 0;

        if (n < 1) {
            System.out.println("Error: " + n + " is not an positive Integer.");
        } else {
            System.out.println("n = " + n);
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();

                if (i == 0) {
                    max = num;
                    min = num;
                }
                if (max < num) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }

            }
            System.out.println("Max: " + max);
            System.out.println("Min: " + min);
        }
    }
}

