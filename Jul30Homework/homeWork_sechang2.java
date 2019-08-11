package Jul30Homework;

import java.util.Scanner;

public class homeWork_sechang2 {
    /*
        Given an odd-length of numbers, return below.
        input: 1,2,3,4,5,6,7 (,도 쳐야함)
        make:  3,2,1,4,7,6,5 then,
        output: 4
                1,7
                2,6
                3,5
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type some numbers with comma(,)");
        String input = sc.nextLine();
        fixed_numbers(input);
    }
    public static void fixed_numbers(String input) {
        // "," 기준으로 인풋을 스플릿하고, 인풋 길이 만큼의 빈 아웃풋 배열을 만든다.
        String[] inputArr = input.split(",");
        String[] outputArr = new String[inputArr.length];

        //
        for (int i = 0; i < inputArr.length/2; i++) {
            outputArr[i] = inputArr[(inputArr.length/2) - (i+1)];
            outputArr[inputArr.length/2] = inputArr[inputArr.length/2];
            outputArr[(i+1) + inputArr.length/2] = inputArr[(inputArr.length) - (i+1)];
        }

        System.out.println(outputArr[outputArr.length/2]);
        for (int i = 0; i < outputArr.length/2; i++) {
            System.out.println(outputArr[outputArr.length/2 - (i+1)] + "," + outputArr[outputArr.length/2 + (i+1)]);
        }

    }
}
