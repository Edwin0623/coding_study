package Jun15Homework;

import java.util.Scanner;

public class homeWork5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an positive Integer: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Error: " + n + " is not an positive Integer.");
        } else {
            int i = 0;
            while (i < n) {
                int j = 0;
                while (j < i) {
                    System.out.print(" ");
                    j++;
                }
                int k = n - i;
                while (k > 0) {
                    System.out.print("*");
                    k--;
                }
                System.out.println();
                i++;
            }
            i = 0;
            while (i < n) {
                int j = 0;
                while (j < n) {
                    System.out.print(" ");
                    j++;
                }
                int k = 0;
                while (k <= i) {
                    System.out.print("*");
                    k++;
                }
                System.out.println();
                i++;
            }
        }
    }
}
