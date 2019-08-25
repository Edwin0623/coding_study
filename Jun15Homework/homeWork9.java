package Jun15Homework;

public class homeWork9 {
    public static void main(String[] args) {
        int[] a = {-1,3,-1,5};
        int max = a[0];

        int i = 0;
        while (i < a.length) {
            int sum = 0;
            int j = i;
            while (j < a.length) {
                sum = sum + a[j];
                if (max < sum) {
                    max = sum;
                }
                j++;
            }
            i++;
        }
        System.out.println("Max of sum: " + max);
    }
}

