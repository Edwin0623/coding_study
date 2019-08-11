package Jul13;

import java.util.Scanner;

public class pr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input_sentence = sc.nextLine();
        System.out.println(fixed_sentence(input_sentence));
    }
    public static String fixed_sentence(String input_sentence) {
        String vowels = "aeiou";
        String output_sentence = "";
        String space = " ";

        if (input_sentence.contains(vowels)) {
            output_sentence = output_sentence.concat("0");
        } else if (input_sentence.contains(space)) {
            output_sentence = output_sentence.concat("9");
        } else {
            output_sentence = output_sentence.concat("1");
        }
        return output_sentence;
    }
}