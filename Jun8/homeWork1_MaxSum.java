package Jun8;

public class homeWork1_MaxSum {
    /*
        배열이 주어지면, 배열안의 원소가 연속해서 더해졌을때 가장 큰 값을 구하기
        input: {-1,3,-1,5}
        output: 7 (3 - 1 + 5 = 7 (Max Sum))
     */
    public static void main(String[] args) {
        int[] a = {-1,3,-1,5};
        int tempSum = a[0];
        int finSum = a[0];

        for (int i = 1; i < a.length; i++) {
            if (tempSum + a[i] < a[i]) {
                tempSum = a[i];
            } else {
                tempSum = tempSum + a[i];
            }
            if (finSum < tempSum) {
                finSum = tempSum;
            }
        }
        System.out.println("final sum = " + finSum);
    }
}

