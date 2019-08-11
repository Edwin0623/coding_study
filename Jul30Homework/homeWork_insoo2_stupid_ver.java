package Jul30Homework;

import java.util.Scanner;

public class homeWork_insoo2_stupid_ver {
    /*
        Roll the Dice: Write a program to determine how many ways can people roll the dice to get the sum 10.
        (1 <= m,n <= 1000)

        input: m = 6 , n = 8
        output: There are 5 ways to get the sum 10.

        input: m = 5, n = 5
        output: There is 1 ways to get the sum 10.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello. This is 'Roll the Dice' and show you how many ways to get the sum 10.");
        System.out.println("Enter an positive Integer m (1 <= m <= 1000)");
        int m = sc.nextInt();
        System.out.println("Enter an positive Integer n (1 <= n <= 1000)");
        int n = sc.nextInt();
        solution(m, n);
    }

    public static void solution(int m, int n) {
        if (m >= 9 && n >= 9) {
            System.out.println("There are " + 9 + " ways to get the sum 10.");
        } else if (m + n < 10) {
            System.out.println("There is no way to get the sum 10.");
        } else if (m + n == 10) {
            System.out.println("There is " + 1 + " way to get the sum 10.");
        } else if (m > 8 && n < 8) {
            System.out.println("There is " + n + " ways to get the sum 10.");
        } else if (m < 8 && n > 8) {
            System.out.println("There is " + m + " ways to get the sum 10.");
        } else {
            System.out.println("There are " + (m + n + 1 - 10) + " ways to get the sum 10.");
        }
    }
}
