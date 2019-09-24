package Z_Mailprogramming;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input x: ");
        long x = sc.nextInt();
        System.out.println("Input n: ");
        int n = sc.nextInt();
        solution(x, n);
    }
    public static void solution(long x, int n) {
        long[] answer = new long[n];

        for (int i = 0; i < n; i++) {
            answer[i] = x*(i+1);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(answer[i] + ", ");
        }
    }
}
