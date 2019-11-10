package Jul13;

import java.util.Scanner;

public class homeWork6 {
    public static void main(String[] args) {
        /*
           6) Given a string, return the string without the last character.
               input: "abcd"
               output: "abc"
         */
//        if (str.charAt(str.length() - 1) == 's') {
//            str = str.concat("es");
//        } else if (str.charAt(str.length() - 1) == 'x') {
//            str = str.concat("es");
//        } else if (str.charAt(str.length() - 1) == 'o') {
//            str = str.concat("es");
//        }
//        if (str.charAt(str.length() - 1) == 'h' && (str != ("fish"))) {
//            str = str.concat("es");
//        } else {
//            str = str;
//        }
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        if (str.substring(str.length()-2) == "fe") {
            str = str.substring(0,str.length()-2).concat("ves");
        }
        System.out.println(str);
    }
}
