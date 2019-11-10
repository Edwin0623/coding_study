package Jul20;

import java.util.Scanner;

public class homeWork_insoo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type first sentence");
        String first_sentence = sc.nextLine();
        System.out.println("Type second sentence");
        String second_sentence = sc.nextLine();
        System.out.println("Type third sentence");
        String third_sentence = sc.nextLine();
        System.out.println();
        ciphertexted_sentence(first_sentence, second_sentence, third_sentence);
    }

    public static void ciphertexted_sentence(String first_sentence, String second_sentnece, String third_sentence) {

        String[] cipher_Arr = new String[third_sentence.length()];

        // 세번째 문장을 전부 .으로 채운다.
        for (int i = 0; i < third_sentence.length(); i++) {
            cipher_Arr[i] = ".";
        }
        // 암호화된 단어를 찾으면 그에 해당하는 단어를 나오게 하고 .이 그 단어로 오버랩된디. 아니면 그대로 . 이 나오게 한다.
        for (int i = 0; i < third_sentence.length(); i++) {
            for (int j = 0; j < second_sentnece.length(); j++) {
                if (Character.toString(third_sentence.charAt(i)).equalsIgnoreCase(Character.toString(second_sentnece.charAt(j)))) {
                    cipher_Arr[i] = Character.toString(first_sentence.charAt(j));
                }
            }
        }

        System.out.println("Cipher sentence");
        for (int i = 0; i < cipher_Arr.length; i++) {
            System.out.print(cipher_Arr[i]);
        }
        System.out.println();
    }
}
