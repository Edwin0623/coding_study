package May25;

public class class1 {
    /*
        양의정수 n, 1 ~ n 까지 홀수 먼저 합하고 짝수 합해서 최종 합을 구하기
     */
    public static void main(String[] args) {
        int n = 10;
        int sumOdd = 0;
        int sumEven = 0;

        // sumOdd = 1 + 3 + 5 + 7 + 9
        for (int i = 1; i <= n; i = i+2) {
            sumOdd = sumOdd + i;
        }

        // sumEven = 2 + 4 + 6 + 8 + 10
        for (int i = 2; i <= n; i = i+2) {
            sumEven = sumEven + i;
        }

        System.out.println("Total Sum: " + (sumOdd + sumEven));
    }
}
