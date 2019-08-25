package Jul31Homework;

import java.util.Scanner;

public class homeWork_muhyun {
    /*
        사이즈가 5인 스트링을 받고, 전부 숫자면 'true'가 나오고 다른 알파벳 하나라도 있으면 'false'가 나오게 하기

        input: 12345
        output: true

        input: a1234
        output: false

         <IDEA>: 한자리라도 숫자가 아니면 'false'이기 떄문에 '0' && '9' 아스키코드를 이용하여 편리하게 비교했다.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a 5-size string");
        String input = sc.nextLine();
        System.out.println(find(input));
    }

    public static boolean find(String input) {
        // boolean = false 로 하면 한자리라도 숫자가 있으면 'true'가 나온다.
        boolean found = true;

        if (input.length() != 5) {
            System.out.println("Error: you made a wrong string.");
        } else {
            for (int i = 0; i < input.length(); i++) {
                // !을 하지않으면, 한 자리라도 숫자면 'true'가 나온다.
                if (!(input.charAt(i) >= (int)'0' && input.charAt(i) <= (int)'9')) {
                    found = false;
                }
            }
        }
        return found;
    }
}