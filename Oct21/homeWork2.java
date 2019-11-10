package Oct21Homework;

public class homeWork2 {
    /*
        문제 1
        길이가 3이상인 정수 배열이 주어졌을 때 가장 값이 큰 3개 원소의 합을 구하시오
     */
    public static void main(String[] args) {
        /*
            IDEA: 'selectionSort'로 큰거 순서대로 정렬한뒤에 배열의 제일 앞에 3개를 더해서 결과값을 나타내겠다.
         */
        int[] data = { 1, 5, 3, 2, 4, 6, 9, 8, 10, 7 };
        // 기본 array
        printArr(data);
        selectionSort(data);
        // 'selectionSort' 한 array
        printArr(data);
        // 'selectionSort' 한 'array'에서 앞에 3개를 더한 것
        sumOfThreeValuesOfArray(data);

    }
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < 3; i++) {
            int max_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[max_index] < arr[j]) {
                    max_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[max_index];
            arr[max_index] = temp;
        }
    }

    public static void sumOfThreeValuesOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of Three Values Of Array: " + sum);
    }
}
