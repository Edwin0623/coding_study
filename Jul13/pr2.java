package Jul13;

import java.util.Scanner;

public class pr2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("put a five digit or alphabet: ");
        String input = s.nextLine();

        String array = "0123456789";

        boolean isTrue = false;

        for (int i = 0; i < input.length(); i++) {
            isTrue = false;
            for (int j = 0; j < array.length(); j++) {
                if (input.charAt(i) == array.charAt(j)) {
                    isTrue = true;
                }
            }
            if (isTrue == false) {
                break;
            }
        }
        System.out.println(isTrue);
    }
}

