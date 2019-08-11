package June15Homework_while;

import java.util.Scanner;

public class homeWork4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an positive Integer: ");
        int n = sc.nextInt();

        int i = 0;
        while (i < n) {
            int j = n - i;
            while (j > 0) {
                System.out.print(j);
                j--;
            }
            System.out.println();
            i++;
        }
        i = 0;
        while (i < n - 1) {
            int j = i + 2;
            while (j > 0) {
                System.out.print(j);
                j--;
            }
            System.out.println();
            i++;
        }

    }
}