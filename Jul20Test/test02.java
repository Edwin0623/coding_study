package Jul20Test;

import java.util.Scanner;

public class test02 {
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
