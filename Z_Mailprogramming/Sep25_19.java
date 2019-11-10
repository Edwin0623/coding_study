package Z_Mailprogramming;

import java.util.Scanner;

public class Sep25_19 {
    /*
        피보나치 배열은 0과 1로 시작하며, 다음 피보나치 수는 바로 앞의 두 피보나치 수의 합이 된다. 정수 N이 주어지면, N보다 작은 모든 짝수 피보나치 수의 합을 구하여라.
        Fibonacci sequence starts with 0 and 1 where each fibonacci number is a sum of two previous fibonacci numbers.
        Given an integer N, find the sum of all even fibonacci numbers.

        IDEA: 각 피보나치 수가 N보다 작아야 한다.
        0,1,1,2,3,5,8,13,21...
        if N = 12
        2 and 8 is lower than N(12).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an positive Integer N: ");
        int N = sc.nextInt();
        // 피보나치 합을 위해서 'sum'을 하나 만든다
        int sum = 0;
        // 첫 피보나치 수 이다. (0 + 1)
        int x = 1;
        System.out.println(x);
        // 두번째 피보나치 수 이다. (1 + 1)
        int y = 2;
        System.out.println(y);

        while (x < N) {
            if (x % 2 == 0) {
                sum += x;
            }
            // 세번째 피보나치 수 이다. (x + y)
            int z = x + y;
            x = y;
            y = z;
            System.out.println(z);
        }
        System.out.println("Answer is: " + sum);
    }
}
