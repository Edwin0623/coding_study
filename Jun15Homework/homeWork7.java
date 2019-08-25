package Jun15Homework;

import java.util.Scanner;

public class homeWork7 {
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
            int i = 0;
            while (i < n) {
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
                i++;
            }
            System.out.println("Max: " + max);
            System.out.println("Min: " + min);
        }
    }
}
