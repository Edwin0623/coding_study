package Oct21Homework;

public class homeWork3 {
    /*
        문제 2
        두개의 정수 배열이 주어지면 합친 정렬된 배열을 프린트 하시오
          input: { 1, 2, 3 } , { 0, 1, 2 }
         output: { 0, 1, 1, 2, 2, 3 }
     */
    public static void main(String[] args) {
        int[] data1 = { 1, 2, 3 };
        int[] data2 = { 0, 1, 2 };
//        printArr(combinedArray(data1, data2));
//        printArr(selectionSort(combinedArray(data1, data2)));
        int[] combinedArray1 = combinedArray(data1, data2);
        selectionSort(combinedArray1);
        printArr(combinedArray1);
    }

    public static int[] combinedArray(int[] arr1, int[] arr2) {
        int[] combined_Array = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            combined_Array[i] = arr1[i];
        }
        for (int i = arr1.length; i < combined_Array.length; i++) {
            combined_Array[i] = arr2[i - arr1.length];
        }
        return combined_Array;
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
        //return arr;
    }
}
