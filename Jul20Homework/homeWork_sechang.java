package Jul20Homework;

import java.util.Scanner;

public class homeWork_sechang {
    /*
        <Homework_Sechang>

        단어를 입력받으면 짝수번째 알파벳은 그대로, 홀수번째 알파벳은 반대로 출력하기.

        input: California (Length: 10 (Even) )
        output: iarifolnCa

        input: Premium (Length: 7 (Odd) )
        output: mrimeuP
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a word");
        String input_word = sc.nextLine();
        System.out.println(fixed_word(input_word));
    }

    public static String fixed_word(String input_word) {
        // 새로운 스트링에다가 내가 필요한 알파벳들을 더해가는 형식임
        String output_word = "";

        for (int i = 0; i < input_word.length(); i++) {
            if (input_word.length() % 2 == 0) {
                if (i % 2 == 0) {
                    // 단어의 길이가 짝수이면, 마지막 알파벳은 짝수번째 이므로 변함없이 더해지고, 그 앞에 있는 알파벳부터 거꾸로 더해진다.
                    // 따라서 두번째 마지막부터 거꾸로 더해지므로 단어 길이의 -2 부터 시작한다.
                    output_word = output_word.concat(Character.toString(input_word.charAt(input_word.length() - 2 - i)));
                } else {
                    output_word = output_word.concat(Character.toString(input_word.charAt(i)));
                }
            }
            else {
                if (i % 2 == 0) {
                    // 단어의 길이가 홀수이면, 마지막 알파벳은 홀수번째 이므로 거꾸로 더해져야 한다.
                    // 따라서 마지막 알파벳 부터 거꾸로 더해지므로 단어 길이의 -1 부터 시작한다.
                    output_word = output_word.concat(Character.toString(input_word.charAt(input_word.length() - 1 - i)));
                } else {
                    output_word = output_word.concat(Character.toString(input_word.charAt(i)));
                }
            }
        }
        return output_word;
    }
}

