package Jul13Homework;

import java.util.Scanner;

public class homeWork3 {
    public static void main(String[] args) {
        /*
           3) Given a string, print all characters in odd index in order.
               input: "abcdefg"
               output: "bdf"
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Type words");
        String word = sc.nextLine();
        System.out.println(odd_words(word));

    }
    public static String odd_words(String word) {
        String odd_word = "";
        for (int i = 1; i < word.length(); i = i + 2) {
            odd_word = odd_word.concat(Character.toString(word.charAt(i)));
        }
        return odd_word;
    }
}
