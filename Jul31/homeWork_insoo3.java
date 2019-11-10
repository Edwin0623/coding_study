package Jul31Homework;

import java.util.Scanner;

public class homeWork_insoo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a word");
        String input = sc.nextLine();
        takes_time(input);
    }
    public static void takes_time(String input) {
        char[] two = {'a','b','c'};
        char[] three = {'d','e','f'};
        char[] four = {'g','h','i'};
        char[] five = {'j','k','l'};
        char[] six = {'m','n','o'};
        char[] seven = {'p','q','r','s'};
        char[] eight = {'t','u','v'};
        char[] nine = {'w','x','y','z'};
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == two[i]);
        }

    }
}
