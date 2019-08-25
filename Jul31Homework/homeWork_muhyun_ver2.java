package Jul31Homework;

import java.util.Scanner;

public class homeWork_muhyun_different_ver {
    /*
        사이즈가 5인 스트링을 받고, 전부 숫자면 'true'가 나오고 다른 알파벳 하나라도 있으면 'false'가 나오게 하기.

        input: 12345
        output: true

        input: a1234
        output: false

         <IDEA>: 앞에 버젼은 '0' && '9' 아스키코드로 표현해서 비교했고, 여기서는 0123456789 라는 스트링으로 비교했다.
                 하나라도 숫자가 아니면 바로 false 이므로 'break'를 걸어서 비교를 종료한다.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a 5-length string");
        String input = sc.nextLine();
        System.out.println(check(input));
    }
    public static boolean check(String input) {
        String numbers = "0123456789";
        boolean check = false;
        for (int i = 0; i < input.length(); i++) {
            check = false;
            for (int j = 0; j < numbers.length(); j++) {
                if (input.charAt(i) == numbers.charAt(j)) {
                    check = true;
                }
            }
            if (check == false) {
                break;
            }
        }
        return check;
    }
}