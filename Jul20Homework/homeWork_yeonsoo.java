package Jul20Homework;

import java.util.Scanner;

public class homeWork_yeonsoo {
    /*
       두 문장을 받고 첫번째 문장은 홀수번째 단어만 두번째 문장은 짝수번째 단어만 출력하되 둘 중 길이가 짧은 문장이 끝나면 긴 문장의 나머지는 순서대로 출력하시오.
         input: I am a good boy and chill
                You are good
         output: I are a good boy and chill
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Type the first sentence");
        String first_sentence = sc.nextLine();
        System.out.println("Type a second sentence");
        String second_sentence = sc.nextLine();
        fixed_sentence(first_sentence, second_sentence);
    }
    public static void fixed_sentence(String first_sentence, String second_sentence) {
        String[] firstArr = first_sentence.split(" ");
        String[] secondArr = second_sentence.split(" ");
        String[] combinedArr;

        // 두 문장중에 긴 문장을 새로운 문장에으로 두고, 짧은 문장이 두번째 문장일 경우에 i=1,3,5... 에 해당하는 단어를 여기에 오버랩 한다.
        if (firstArr.length >= secondArr.length) {
            combinedArr = firstArr;
            for (int i = 1; i < secondArr.length; i = i + 2) {
                combinedArr[i] = secondArr[i];
            }
        }
        // 두 문장중에 긴 문장을 새로운 문장으로 두고, 짧은 문장이 첫번째 문장일 경우에 i=0,2,4... 에 해당하는 단어를 이 배열에 오버랩한다.
        else {
            combinedArr = secondArr;
            for (int i = 0; i < firstArr.length; i = i + 2) {
                combinedArr[i] = firstArr[i];
            }
        }
        // 결합된 새로운 문장을 출력한다.
        for (int i = 0; i < combinedArr.length; i++) {
            System.out.print(combinedArr[i] + " ");
        }
    }
}

