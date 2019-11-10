package Nov02;

public class homeWork3 {
    /*
        3) 정수배열이 주어지면 MEDIAN 값을 프린트하시오 (길이가 짝수일 경우, 중간 2개의 원소의 평균값을 리턴)
     */
    public static void main(String[] args) {
        int[] data = { 20, 1, 3, 4, 12, 8, 7, 10 };
        selectionSort(data);
        printArr(data);
        printMedianElement(data);
    }

    public static void selectionSort(int[] arr) {
        // 낮은 순서대로 sort 를 해준다
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
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printMedianElement(int[] arr) {
        if (arr.length % 2 == 1) {
            System.out.println(arr[arr.length / 2]);
        } else {
            double average1 = (arr[arr.length/2 - 1] / 2.0);
            double average2 = (arr[arr.length/2] / 2.0);
            System.out.println(average1 + average2);
        }
    }
}
