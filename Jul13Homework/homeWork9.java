package Jul13Homework;

import java.util.Scanner;

public class homeWork9 {
    public static void main(String[] args) {
        /*
           9) Given a word, return the number of vowels
               input: "apple"
               output: 2
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a word");
        String str = sc.nextLine();
        num_of_vowels(str);
    }
    public static void num_of_vowels(String str) {
        // This vowels array is used for finding out vowels from String user input
        char[] vowels = {'a','e','i','o','u'};
        // This String is used to put the found vowels
        String numOfVowels = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (str.charAt(i) == vowels[j]) {
                    System.out.println(vowels[j]);
                    // found vowels is put into the string numOrVowels
                    numOfVowels = numOfVowels.concat(Character.toString(vowels[j]));
                }
            }
        }
        // count how many vowels in the String with length() of String
        System.out.println(numOfVowels.length());
    }
}
