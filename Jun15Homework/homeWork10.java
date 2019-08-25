package Jun15Homework;

import java.util.Scanner;

public class homeWork10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an positive Integer: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Error: " + n + " is not an positive Integer.");
        } else {
            System.out.println("Enter an Integer for " + n);
            int[] a = new int[n];
            int i = 0;
            while (i < n) {
                int numN = sc.nextInt();
                a[i] = numN;
                i++;
            }
            System.out.print("Enter an positive Integer: ");
            int y = sc.nextInt();
            i = 0;
            while (i < y) {
                int numY = sc.nextInt();
                boolean found = false;
                int j = 0;
                while (j < a.length) {
                    if (numY == a[j]) {
                        found = true;
                    }
                    j++;
                }
                if (found) {
                    System.out.println("found");
                } else {
                    System.out.println("not found");
                }
                i++;
            }
        }
    }
}
