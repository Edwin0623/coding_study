package Jul20;

import java.util.Scanner;

public class homeWork_seyoung {
    /*
        문장을 받고 모음이면 0 자음이면 1 빈칸이면 9를 출력하기

        input:  i am a boy
        output: 0901909101
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a sentence");
        String sentence = sc.nextLine();
        fixed_sentence(sentence);
    }

    public static void fixed_sentence(String sentence) {
        // 대문자 모음도 인식하려면 equalsIgnoreCase를 써야해서 문자 배열로 만든다.
        String[] vowels = {"a","e","i","o","u"};
        char space = ' ';
        String[] output = new String[sentence.length()];

        for (int i = 0; i < sentence.length(); i++) {
            if (vowels[0].equalsIgnoreCase(Character.toString(sentence.charAt(i))) || vowels[1].equalsIgnoreCase(Character.toString(sentence.charAt(i)))
                || vowels[2].equalsIgnoreCase(Character.toString(sentence.charAt(i))) || vowels[3].equalsIgnoreCase(Character.toString(sentence.charAt(i)))
                || vowels[4].equalsIgnoreCase(Character.toString(sentence.charAt(i)))) {
                output[i] = "0";
            } else if (sentence.charAt(i) == space) {
                output[i] = "9";
            } else {
                output[i] = "1";
            }
        }
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i]);
        }
    }
}



