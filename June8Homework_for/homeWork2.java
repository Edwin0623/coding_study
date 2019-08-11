package June8Homework_for;

import java.util.Scanner;

public class homeWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an positive Integer: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Error: ");
        } else {
            int[] a = new int[n];
            System.out.println("Enter an Integer for " + n);
            for (int i = 0; i < n; i++) {
                int numN = sc.nextInt();
                a[i] = numN;
            }
            System.out.print("Enter an positive Integer: ");
            int y = sc.nextInt();
            for (int i = 0; i < y; i++) {
                int numY = sc.nextInt();
                boolean found = false;
                for (int j = 0; j < n; j++) {
                    if (numY == a[j]) {
                        found = true;
                    }
                }
                if (found) {
                    System.out.println("found");
                } else {
                    System.out.println("not found");
                }
            }
        }
    }
}

