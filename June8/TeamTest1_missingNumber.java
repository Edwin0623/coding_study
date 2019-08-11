package June8;

import java.util.Scanner;

public class TeamTest1_missingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This is for Test.");  // Finding Missing number.
        System.out.print("Enter an positive Integer: ");
        int n = sc.nextInt();
        int sum = 0;
        int sum1 = 0;

        if (n < 1) {
            System.out.println("Error: " + "'" + n + "'" + " is not an positive Integer.");
        } else {
            System.out.println("n = " + n);
            for (int i = 1; i <= n; i++) {
                sum = sum + i;
            }
            for (int i = 1; i <= n - 1; i++) {
                int a = sc.nextInt();
                sum1 = a + sum1;
            }

        }
        System.out.println("Missing number: " + (sum - sum1));
    }
}


