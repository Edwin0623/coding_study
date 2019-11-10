package Jun8;

public class homeWork1_nogada {
    public static void main(String[] args) {
        int[] a = {-7,5,4,-5,-3,7};
        int max = a[0];

        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = i; j < a.length; j++) {
                sum = sum + a[j];
                System.out.println("Sum (a" + i + " ~ " + "a" + j + ") = " + sum);

                if (max < sum) {
                    max = sum;
                }

            }
        }
        System.out.println("max of Sums: " + max);
    }
}

