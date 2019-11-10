package Jul31;

import java.util.Scanner;

public class homeWork_yeonsoo {
    /*
        Given a word, return sum of spaces

        input: Deposit cash or checks at most Chase ATMS
        output: 7
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a sentence");
        String input = sc.nextLine();
        String[] inputArr = input.split(" ");
        // 스플릿한 배열의 길이에서 -1 하면 스페이스의 갯수를 구할 수 있다.
        System.out.println("Sum of spaces: " + (inputArr.length-1));
    }
}
