package Jul30Homework;

import java.util.Scanner;

public class homeWork_sechang {
    /*
        Given a odd-length numbers
        input: 1234567
        make:  3214765 then,
        output: 4
                1,7
                2,6
                3,5
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a odd-length numbers");
        String input_numbers = sc.nextLine();
        String[] reversedArr = new String[input_numbers.length()];

        // 반대로 된거 만듬
        for (int i = 0; i < input_numbers.length()/2; i++) {
            reversedArr[i] = Character.toString(input_numbers.charAt(input_numbers.length()/2 - (i+1)));
            reversedArr[(i+1) + input_numbers.length()/2] = Character.toString(input_numbers.charAt(input_numbers.length() - (i+1)));
        }
        reversedArr[input_numbers.length()/2] = Character.toString(input_numbers.charAt(input_numbers.length()/2));

        // 출력하는 용
        System.out.println(reversedArr[reversedArr.length/2]);
        for (int i = 0; i < reversedArr.length/2; i++) {
            System.out.println(reversedArr[reversedArr.length/2 - (i+1)] + "," + reversedArr[reversedArr.length/2 + (i+1)]);
        }
    }
}
