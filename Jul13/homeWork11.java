package Jul13;

import java.util.Scanner;

public class homeWork11 {
    public static void main(String[] args) {
        /*
           11) Given a sentence, return total number of words in the sentence.
                input: "I am a boy"
                output: 4
         */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String strArr[] = str.split(" ");
        System.out.println("Number of words in the sentence:" + strArr.length);
    }
}
