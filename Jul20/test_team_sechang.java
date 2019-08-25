package Jul20Homework;

import java.util.Scanner;

public class test_team_sechang {
    /*
        <Team Sechang: Sechang, Muhyun>

        문장을 받고, 단어의 길이가 홀수이면 거꾸로 출력하고 짝수면 그대로 출력하기

        input: I am a boy
        output: I am a yob
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a sentence");
        String sentence = sc.nextLine();
        System.out.println(reversed_odd_sentence(sentence));
    }
    public static String reversed_odd_sentence(String sentence) {
        String reversed_sentence = "";
        String[] splited_input = sentence.split(" ");
        for (int i = 0; i < splited_input.length; i++) {
            String for_reverse = "";
            String copied_index = splited_input[i];
            if (copied_index.length() % 2 != 0) {
                for (int j = copied_index.length() - 1; j >= 0; j--) {
                    for_reverse = for_reverse.concat(Character.toString(copied_index.charAt(j)));
                }
                splited_input[i] = for_reverse;
            }
            reversed_sentence = reversed_sentence.concat(splited_input[i] + " ");
        }
        return reversed_sentence.substring(0,reversed_sentence.length()-1);
    }
}
