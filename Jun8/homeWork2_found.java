package Jun8Homework;

import java.util.Scanner;

public class homeWork2_found {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an positive Integer: ");
        // 배열에 사용자가 몇번이나 숫자를 넣을껀지 정함
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Error: ");
        } else {
            // 사용자가 정한 숫자랑 같은 사이즈를 가진 빈 배열을 만든다
            int[] a = new int[n];
            System.out.println("Enter an Integer for " + n);
            // 반복문을 이용해 빈 배열에 숫자를 넣는다
            for (int i = 0; i < n; i++) {
                int numN = sc.nextInt();
                a[i] = numN;
            }
            System.out.print("Enter an positive Integer: ");
            // 배열에 숫자가 있는지 없는지 몇 번이나 체크 할지 정한다
            int y = sc.nextInt();
            // 반복문을 이용해 정한 횟수만큼 찾는다
            for (int i = 0; i < y; i++) {
                int numY = sc.nextInt();
                // 'boolean'은 이 for-loop 안에 있어야 한다. 그렇지 않으면 한번이라도 찾으면 모두 'true'가 되고, 못 찾으면 'false'가 된다
                boolean found = false;
                for (int j = 0; j < n; j++) {
                    if (numY == a[j]) {
                        found = true;
                    }
                }
                // 이 'if'문도 for-loop 안에 있어야 한다. 'boolean'이 안에 있기 때문이다
                if (found) {
                    System.out.println("found");
                } else {
                    System.out.println("not found");
                }
            }
        }
    }
}

