package June8;

import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This is for studying Int Array.");

        int[] a = new int[5]; // Make Int array: size for 5

        for (int i = 0; i < a.length; i++) {
            int n = sc.nextInt(); // Let users input elements for array 'a'
            a[i] = n;
        }

        System.out.print("Array a: ");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}

