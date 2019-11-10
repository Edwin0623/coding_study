package Jul13;

import java.util.Scanner;

public class homeWork8 {
    public static void main(String[] args) {
        /*
           8) Given a verb, return the past tense of the verb. (by adding 'ed')
               input: "want"
               output: "wanted"
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a verb.");
        String str = sc.nextLine();
        past_tense(str);

    }
    public static void past_tense(String str) {
        str = str.concat("ed");
        System.out.println(str);
    }
}
 // return 하면 함수 나감