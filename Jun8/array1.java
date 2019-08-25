package Jun8;

public class array1 {
    /*
        배열 안에 원소 위치 바꾸기
        Given an array, return an array with the elements in the reversed order.

        input: {1,2,3,4,5}
        output: {5,4,3,2,1}
     */
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5}; // Array size: 5

        // 바꾸기 전 배열 출력
        System.out.println("Print array");
        for (int i = 0; i < arr.length; i++) { // i = 0, 1, 2, 3, 4
            System.out.print(arr[i]); // arr[0] = 1, arr[1] = 2, ,, ,arr[4] = 5
        }
        System.out.println();

        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];  // if i = 0 -> result of this row: int [] a = {5,2,3,4,5}
            arr[arr.length - i - 1] = temp;  // if i = 0 -> result of this row: int [] a = {5,2,3,4,1}
        }

        System.out.println("Print reversed array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();

    }
}

