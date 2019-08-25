package Jun8;

import java.util.Scanner;

public class for_Loop_Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This is for 'For-loop' function test.");
        System.out.print("Enter an positive Integer: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Error: " + "'" + n + "'" + " is not an positive Integer.");
        } else {
            System.out.println("n = " + n);
            System.out.println();

            for (int i = 0; i < 2*n + 1; i++) {
                System.out.print("#");
            }
            System.out.println();
            for (int i = 0; i < n; i++) {
                System.out.print("#");
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2*(i + 1) - 1; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("#");
                System.out.println();
            }

            for (int i = 0; i < n - 1; i++) {
                System.out.print("#");
                for (int j = 0; j < i + 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2*(n - i - 1) - 1; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < i + 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("#");
                System.out.println();
            }
            for (int i = 0; i < 2*n + 1; i++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}

