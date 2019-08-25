package Jun15Homework;

import java.util.Scanner;

public class homeWork11_extra {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("This shows sum of n you enter.");

        while (true) {
            System.out.print("Enter an positive Integer or exit this program: ");
            int sum = 0;
            int n = s.nextInt();

            if (n <= 0) {
                System.out.println("Exit this program.");
                break;
            } else {
                int i = 1;
                while (i < n + 1) {
                    sum = sum + i;
                    i++;
                }
            }
            System.out.println("Sum: " + sum);
        }
    }
}

