package June8;

public class array1 {
    public static void main(String[] args) {
        System.out.println("Hello. This is for studying Int Array");

        int[] a = {1,2,3,4,5}; // Size of array 'a' is 5

        System.out.print("Array of a: " );
        for (int i = 0; i < a.length; i++) { // i = 0, 1, 2, 3, 4
            System.out.print(a[i]); // a[0] = 1, a[1] = 2, ,, ,a[4] = 5
        }
        System.out.println();

        for (int i = 0; i < a.length/2; i++) {
            int temp = a[i]; // Point: clone of a[0] ~ a[2]
            a[i] = a[a.length - i - 1];  // if i = 0 -> result of this row: int [] a = {5,2,3,4,5}
            a[a.length - i - 1] = temp;  // if i = 0 -> result of this row: int [] a = {5,2,3,4,1}
        }

        System.out.print("Reverse array of a: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

    }
}

