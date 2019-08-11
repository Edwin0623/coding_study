package Jul13Homework;

import java.util.Scanner;

public class homeWork10 {
    public static void main(String[] args) {
        /*
           10) Given a word with even length, split the word in half and insert " & " in-between.
                input: "abcd"
                output: "ab & cd"
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a word with even length");
        String str = sc.nextLine();
        split_insert(str);
    }
    public static void split_insert(String str) {
        if (str.length() % 2 == 0) {
            str = str.substring(0,str.length()/2).concat(" & " + str.substring(str.length()/2));
            System.out.println(str);
        } else {
            System.out.println("Sorry, type a word with even length.");
        }
    }
}
