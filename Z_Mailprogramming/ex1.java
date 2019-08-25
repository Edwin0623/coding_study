package Z_Mailprogramming;

public class ex1 {
    /*
        정수 배열과 정수 k가 주어지면 모든 원소를 k칸씩 앞으로 옮기시오. (시간복잡도를 최대한 최적화 하시오)
        Given an array, rotate the array to the right by k steps, where k is non-negative.

        input: [1, 2, 3, 4, 5], k=2
        output: [3, 4, 5, 1, 2]

        input: [0, 1, 2, 3, 4], k=1
        output: [1, 2, 3, 4, 0]
     */
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;

        printArr(rotate(arr, k));

        int[] arr1 = {0,1,2,3,4};
        int k1 = 1;

        printArr(rotate(arr1, k1));
    }
    public static int[] rotate(int[] arr, int k) {
        int n = arr.length;
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
        return arr;
    }
    public static int[] reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
