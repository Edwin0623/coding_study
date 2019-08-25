package June15Homework_while;

public class homeWork8 {
    public static void main(String[] args) {
        int[] a = {-1,3,-1,5};
        int temp = a[0];
        int fin = a[0];

        int i = 1;
        while (i < a.length) {   // 2 3
            if (temp + a[i] < a[i]) {
                temp = a[i];
            } else {
                temp = temp + a[i];
            }
            if (fin < temp) {
                fin = temp;
            }
            i++;
        }
        System.out.println("Max of Sum: " + fin);
    }
}
