package Jul31;

public class class01 {
    /*
        가운데 글자가 출력 안되게 하기
        input: I love Z_Mailprogramming
        output: I Z_Mailprogramming
     */
    public static void main(String[] args) {
        String input = "I love Z_Mailprogramming";
        String[] inputArr = input.split(" ");

        for (int i = 0; i < inputArr.length; i++) {
            if (i != 1) {
                System.out.print(inputArr[i] + " ");
            }
        }
    }
}
