package Jul13Homework;

import java.util.Scanner;

public class homeWork1 {
    public static void main(String[] args) {
        // use Scanner function in java to let user make an input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any word and this program will show you reversed word you write.");
        // make string 'word' from user using Scanner function in java
        String word = sc.nextLine();
        System.out.println(reverse(word));
    }
    // Make reverse function
    public static String reverse(String word) {
        // Make an empty String so that input reversed_word in this String.
        String reversed_word = "";
        // Input reversed_word in String reversed_word using for-loop function in java.
        for (int i = word.length() - 1; i >= 0; i--) {
            // Character.toSting is used to activate concat function because concat need String not an char
            reversed_word = reversed_word.concat(Character.toString(word.charAt(i)));
        }
        // result is reversed_word
        return reversed_word;
    }
}
