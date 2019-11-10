package Oct21;

public class homeWork1 {
    /*
        숙제2: 정렬 방법 하나를 골라서 아래의 문제를 풀기
              아래의 문제: 짝수 길이의 정렬되지 않은 배열이 주어지면
              첫번째 반절은 증가되는 순서로, 두번째 반절은 감소되는 순서로 정렬하시오.
               input: { 1, 5, 3, 4, 8, 0, 2, 3 }
              output: { 1, 3, 4, 5, 8, 3, 2, 0 }
     */
    public static void main(String[] args) {
        /*
            IDEA: 'selectionSort'를 두번에 나눠서 한다. 처음은 증가되는 순서로, 나머지는 감소되는 순서로.
         */
        int[] data = { 1, 5, 3, 4, 8, 0, 2, 3 };
        printArr(data);
        selectionSort(data);
        printArr(data);
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length/2; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }

        for (int i = arr.length/2; i < arr.length; i++) {
            int max_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[max_index]) {
                    max_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[max_index];
            arr[max_index] = temp;
        }
    }
}
