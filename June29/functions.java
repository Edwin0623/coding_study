package June29;

// && and Gate
// || or Gate
// != vs ==
// functions

public class functions {
    public static void main(String[] args) {
        int[] a = {1,3,5,7,9};

        printingArray(a);

        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] + 1;
        }

        printingArray(a);

        int[] c = {1,3,5,7,9};

        for (int i = 0; i < c.length; i++) {
            c[i] = getBiggerNumber(c[i]);
        }

        printingArray(c);
    }

    public static void printingArray(int[] arr) {
        System.out.println("Printing Array!");
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Done!" + "\n");
    }

    public static int getBiggerNumber(int a) {
        return a + 1;
    }

}
