package Jul13;

import java.util.Scanner;

public class homeWork4 {
    public static void main(String[] args) {
        /*
           4) Given two strings, return true if two strings are equal. (ignore case)
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Type string1");
        String str1 = sc.nextLine();
        equals(str1);

    }
    public static void equals(String str1) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type string2");
        String str2 = sc.nextLine();
        System.out.println(str1.equalsIgnoreCase(str2));
    }
}
