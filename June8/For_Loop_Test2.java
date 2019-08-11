package June8;

import java.util.Scanner;

public class For_Loop_Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This is for Test.");
        System.out.print("Enter an positive Integer: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Error: " + "'" + n + "'" + " is not an positive Integer.");
        } else {
            System.out.println("n = " + n);
            System.out.println();

            for (int k = n; k >= 1; k--) {
                for (int i = 0; i < k; i++) {
                    for (int j = 1; j <= k - i; j++) {
                        System.out.print(2*j-1);
                    }
                    System.out.println();
                }
                System.out.println();
            }
        }
    }
}


