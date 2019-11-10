package Jul31;

import java.util.Scanner;

public class homeWork_insoo1 {
    /*
        Given a sentence, return the sentence in reverse order.

        input: How are you
        output: woH era uoy
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a sentence");
        String input_sentence = sc.nextLine();
        fixed_sentence(input_sentence);
    }
    public static void fixed_sentence(String input_sentence) {

        // 전체 문장을 리버스 한다.
        String reversed_sentence = "";
        for (int i = input_sentence.length() - 1; i >= 0; i--) {
            reversed_sentence = reversed_sentence.concat(Character.toString(input_sentence.charAt(i)));
        }

        // 리버스 된 문장을 스플릿 하여 반대 순서로 출력한다.
        String[] reversedArr = reversed_sentence.split(" ");
        for (int i = reversedArr.length - 1; i >= 0; i--) {
            System.out.print(reversedArr[i] + " ");
        }

    }
}
