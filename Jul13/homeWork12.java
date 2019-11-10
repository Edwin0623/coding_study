package Jul13Homework;

import java.util.Scanner;

public class homeWork12 {
    public static void main(String[] args) {
        /*
           12) Given a sentence, return a sentence with all the words in reverse order.
                input: "I am a boy"
                output: "boy a am I"
         */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        reversed_words(str);
    }
    public static void reversed_words(String str) {
        String strArr[] = str.split(" ");
        for (int i = strArr.length - 1; i >= 0; i--) {
            System.out.print(strArr[i] + " ");
        }
    }
}
