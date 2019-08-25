package June15Homework_while;

import java.util.Scanner;

public class homeWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an positive Integer: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Error: " + n + " is not an positive Integer.");
        } else {
            System.out.println("n = " + n);
            int i = 0;
            while (i < n) {
                int j = 0;
                while (j < n - (i + 1)) {
                    System.out.print(" ");
                    j++;
                }
                int k = (i + 1);
                while (k > 0) {
                    System.out.print(k);
                    k--;
                }
                System.out.println();
                i++;
            }
            i = 0;
            while (i < n - 1) {
                int j = 0;
                while (j <= i) {
                    System.out.print(" ");
                    j++;
                }
                int k = n - 1 - i;
                while (k > 0) {
                    System.out.print(k);
                    k--;
                }
                System.out.println();
                i++;
            }
        }
    }
}
