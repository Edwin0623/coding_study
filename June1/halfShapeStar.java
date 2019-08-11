package June1;

import java.util.Scanner;

public class halfShapeStar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an positive Integer: ");
        int n = s.nextInt();

        if (n < 1) {
            System.out.println("Error: " + n + " is not an positive Integer.");
        } else {
            System.out.println("n = " + n);
            for (int i = 1; i < n + 1; i++) {
                for (int j = 1; j < i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
