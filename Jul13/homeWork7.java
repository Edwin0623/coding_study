package Jul13;

import java.util.Scanner;

public class homeWork7 {
    public static void main(String[] args) {
        /*
           7) Given a noun, return the plural form of the noun. (by adding 's' or 'es')
               input: "apple"
               output: "apples"

               input: "potato"
               output: "potatoes"
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Type a noun: ");
        String str = sc.nextLine();
        plural_form(str);

    }
    public static void plural_form(String str) {
        // use '==' because '' is char
        if (str.charAt(str.length() - 1) == 's') {
            str = str.concat("es");
        } else if (str.charAt(str.length() - 1) == 'h') {
            str = str.concat("es");
        } else if (str.charAt(str.length() - 1) == 'o') {
            str = str.concat("es");
        } else if (str.charAt(str.length() - 1) == 'y') {
            str = str.concat("es");
        } else if (str.charAt(str.length() - 1) == 'x') {
            str = str.concat("es");
        } else if (str.charAt(str.length() - 1) == 'z') {
            str = str.concat("es");
        }
        // use equals because "fe" is string
        else if (str.substring(str.length()-2).equals("fe")) {
            str = str.substring(0,2).concat("ves");
        } else {
            str = str.concat("s");
        }
        System.out.println(str);
    }
}
