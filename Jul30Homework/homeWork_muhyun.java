package Jul30Homework;

import java.util.Scanner;

public class homeWork_muhyun {
    /*
        사이즈가 5인 스트링을 받고, 전부 숫자면 'true'가 나오고 다른 알파벳 하나라도 있으면 'false'가 나오게 하기

        input: 12345
        output: true

        input: a1234
        output: false
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a 5-size string");
        String input = sc.nextLine();
        System.out.println(find(input));
    }

    public static boolean find(String input) {
        // 전부 숫자만 있는 스트링을 기준으로 한다.
        boolean found = true;
        if (input.length() != 5) {
            System.out.println("Error: you made a wrong string.");
        } else {
            for (int i = 0; i < input.length(); i++) {
                // !을 하지않으면, 한 자리라도 숫자면 'true'가 나온다.
                if (!(input.charAt(i) >= '0' && input.charAt(i) <= '9')) {
                    found = false;
                }
            }
        }
        return found;
    }
}

/*
    Note: 처음에 boolean = false 로 하고, 'charAt()'써서 각 자리에 있는 것이 숫자이면 'true'로 나오게 했는데
          이러면 한자리라도 숫자가 있으면 'true'가 나왔다. 그래서 boolean = true (전부 숫자만 입력하는 것을 default) 로 해서 시작했다.
 */