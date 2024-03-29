package Jul20;

import java.util.Scanner;

public class test_team_seyoung {
    /*
        <Team Seyoung: Seyoung, Yeonsoo>

        문장을 입력받고, 문장안의 단어개수가 짝수이면 앞 뒤끼리 바꾸고 홀수이면 가운데 단어를 기준으로 왼쪽과 오른쪽의 단어를 바꾸어라

        (문장안에 단어갯수가 짝수)                  (문장안에 단어갯수가 홀수)
        input: We are so good and happy  \\   input: I am a good boy
        output: are we good so happy and \\   output: good boy a I am
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a sentence");
        String input_sentence = sc.nextLine();
        System.out.println(reversed_sentence(input_sentence));
    }
    public static String reversed_sentence(String input_sentence) {
        String[] splited_inputArr = input_sentence.split(" ");
        if (splited_inputArr.length % 2 == 0) {
            for (int i = 0 ; i < splited_inputArr.length; i = i + 2) {
                String copied_index = splited_inputArr[i];
                splited_inputArr[i] = splited_inputArr[i+1];
                splited_inputArr[i+1] = copied_index;
            }
            String reordered_input = "";
            for (int i = 0; i < splited_inputArr.length; i++) {
                reordered_input = reordered_input.concat(splited_inputArr[i] + " ");
            }
            return reordered_input;
        } else {
            String reordered_input = "";
            for (int i = (splited_inputArr.length / 2) + 1; i < splited_inputArr.length; i++) {
                reordered_input = reordered_input.concat(splited_inputArr[i] + " ");
            }
            reordered_input = reordered_input.concat(splited_inputArr[splited_inputArr.length/2] + " ");
            for (int i = 0; i < splited_inputArr.length/2 - 1; i++) {
                reordered_input = reordered_input.concat(splited_inputArr[i] + " ");
            }
            reordered_input = reordered_input.concat(splited_inputArr[splited_inputArr.length/2 - 1]);
            return reordered_input;
        }
    }
}
