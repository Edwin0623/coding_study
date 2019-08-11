package Jul30Homework;

import java.util.Scanner;

public class homeWork_seyoung {
    /*
        Given a word, return sum of consonants and vowels.

        input: people
        output: Sum of consonants: 3
                Sum of vowels: 3
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a word");
        String input_word = sc.next();
        // 대문자 모음도 인식하려면 'equalsIgnoreCase'기능을 써야해서 문자 배열로 만든다.
        String[] vowers = {"a","e","i","o","u"};
        // 모음을 세고, 전체 길이에서 모음갯수 빼면 자음의 갯수를 구할 수 있다.
        int sum_of_vowels = 0;

        for (int i = 0; i < input_word.length(); i++) {
            for (int j = 0 ; j < vowers.length; j++) {
                if (vowers[j].equalsIgnoreCase(Character.toString(input_word.charAt(i)))) {
                    // 모음을 찾으면 +1을 해새 모음의 갯수를 센다.
                    sum_of_vowels = sum_of_vowels + 1;
                }
            }
        }

        System.out.println("Sum of consonant: " + (input_word.length() - sum_of_vowels));
        System.out.println("Sum of vowels: " + sum_of_vowels);
    }
}
