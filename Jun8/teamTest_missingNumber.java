package Jun8;

import java.util.Scanner;

public class teamTest_missingNumber {
    /*
        양의정수 n이 주어지면 n-1만큼 입력해서 1 ~ n 사이에 입력 하지 않은 숫자 찾아내기

        input1: 5 --> 1 ~ 5가 존재
        input2: 1,2,3,4
        output: 5 (missing number)
     */
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
                System.out.println("Enter a positive integer within 4 excluding numbers entered so far "
                        + (n-1) + "(" + i + "/" + (n-1) + ")");
                int a = sc.nextInt();
                sum1 = a + sum1;
            }
        }
        System.out.println("Missing number: " + (sum - sum1));
    }
}


