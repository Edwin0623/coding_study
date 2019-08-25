package June29;

// && and Gate
// || or Gate
// != vs ==
// functions

public class functions {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(function(x));

        System.out.println(function2(x));

        // 1,3,5,7,9 -> 1,3,5,7,9
        int[] a = {1,3,5,7,9};
        printingArray(a);

        // 1,3,5,7,9 -> 2,4,6,8,10
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] + 1;
        }
        printingArray(a);

        // 2,4,6,8,10 -> 3,5,7,9,11
        for (int i = 0; i < a.length; i++) {
            a[i] = getBiggerNumber(a[i]);
        }
        printingArray(a);
    }
    public static int function(int x) {
        x = x + 10;
        return x;
    }
    public static int function2(int y) {
        y = 2 * y;
        return y;
    }
    public static void printingArray(int[] arr) {
        System.out.println("Printing Array!");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static int getBiggerNumber(int a) {
        return a + 1;
    }

}
