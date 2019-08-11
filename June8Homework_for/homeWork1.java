package June8Homework_for;

public class homeWork1 {
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

