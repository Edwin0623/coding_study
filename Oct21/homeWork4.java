package Oct21;

public class homeWork4 {
    /*
        정수 배열이 주어지면 배열을 오름 차순으로 정렬한 후 정렬된 배열 원소들을 원래 배열의 인덱스로 나타내시오.
          input: { 3, 0, 2, 6 }
         output: { 1, 2, 0, 3 }
     */
    public static void main(String[] args) {
        // 요소가 같을 경우 오류 생기는데 이거 해결해야 함
        int[] data = { 1, 1, 0, 0 };

        // data 카피한다
        int[] copied_data = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            copied_data[i] = data[i];
        }

        selectionSort(data);
        printArr(data);
        printArr(aaa(data, copied_data));
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void selectionSort(int[] arr) {
        // 오름차순으로 정렬한다
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

    public static int[] aaa(int[] arr, int[] copied_data) {
        // 정렬한 배열의 요소와 원래 배열의 요소의 index 위치를 비교하여 새로운 배열에 넣어준다.
        int[] new_data = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == copied_data[j]) {
                    new_data[i] = j;
                }
            }
        }
        return new_data;
    }
}

