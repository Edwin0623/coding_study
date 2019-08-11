package Jul30Homework;

import java.util.Scanner;

public class homeWork_insoo2 {
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
        System.out.println("What Sum do you want?");
        int input_Sum = sc.nextInt();
        getWays(input_Sum);
    }

    public static void getWays(int input_Sum) {
        Scanner sc = new Scanner(System.in);
        // The sum is always equaled to or greater than 2.
        if (input_Sum < 2) {
            System.out.println("Error: The sum should be equal to or greater than 2.");
        } else {
            System.out.println("Enter the first number(m) rolled on the dice (1 <= m <= 1000)");
            int m = sc.nextInt();
            System.out.println("Enter the second number(n) rolled on the dice (1 <= n <= 1000)");
            int n = sc.nextInt();
            String ways = "";
            if (m < 1 || n < 1) {
                System.out.println("Error: Dice number should be equal to or greater than 1");
            } else {

                for (int j = 1; j <= m; j++) {
                    for (int k = 1; k <= n; k++) {
                        if (j + k == input_Sum) {
                            // Put "1" into the String 'ways' when this program found a way.
                            ways = ways.concat("1");
                            break;
                        }
                    }
                    // For-loop 기능이 비효율적으로 많이 반복할 것을 방지한다. m 과 n이 'Sum' 보다 크면 'Sum'을 구하는 방법은 (Sum - 1) 만큼이 최대다.
                    if (j == input_Sum) {
                        break;
                    }
                }
            }
            showWays(ways);
        }
    }

    public static void showWays(String ways) {
        if (ways.length() == 0) {
            System.out.println("There is no way to get the sum 10.");
        } else if (ways.length() == 1) {
            System.out.println("There is " + ways.length() + " way to get the sum 10.");
        } else {
            System.out.println("There are " + ways.length() + " ways to get the sum 10.");
        }
    }
}

