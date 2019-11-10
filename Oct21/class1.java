package Oct21;

public class class1 {
    /*
        설명: https://hsp1116.tistory.com/33
        selection sort - 선택정렬
        insertion sort - 삽입정렬: https://marobiana.tistory.com/8
        bubble sort - 버블정렬

        숙제1: 3가지 방법 정렬 다 외우기
        숙제2: 정렬 방법 하나를 골라서 아래의 문제를 풀기
                아래의 문제: 짝수 길이의 정렬되지 않은 배열이 주어지면
                첫번째 반절은 증가되는 순서로, 두번째 반절은 감소되는 순서로 정렬하시오.
                input: { 1, 5, 3, 4,    8, 0, 2, 3 }
                output: { 1, 3, 4, 5, 8, 3, 2, 0 }
     */
    public static void main(String[] args) {
        int[] data = { 1, 5, 3, 0, 2, 4 };
        System.out.println("Given Data");
        printArr(data);
        System.out.println();

        System.out.println("Bubble Sort");
        bubbleSort(data);
        printArr(data);
        System.out.println();

        System.out.println("Selection Sort");
        selectionSort(data);
        printArr(data);
        System.out.println();

        System.out.println("Insertion Sort");
        insertionSort(data);
        printArr(data);
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void swapElements(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void selectionSort(int[] arr) {
        // 1 5 3 0 2 4
        // 0 5 3 1 2 4  i = 0
        // 0 1 3 5 2 4  i = 1
        // 0 1 2 5 3 4  i = 2
        // 0 1 2 3 5 4  i = 3
        // 0 1 2 3 4 5  i = 4
        // 0 1 2 3 4 5  i = 5

        // i번째 원소에 들어갈 놈을 찾는다.
        for (int i = 0; i < arr.length - 1; i++) {
            int min_index = i;
            // i 부터 배열 끝까지중에 가장 작은놈을 찾는다.
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            // 가장 작은놈과 i번째 원소를 교체한다.
            swapElements(arr, i, min_index);
        }
    }

    public static void insertionSort(int[] arr) {
        // i 번째 있는 원소가 왼쪽으로 봤을때 맞는곳에 있는가?
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            // 왼쪽이 정렬되있다고 가정후, i번째 원소를 맞는곳에 넣어준다.
            while (j >= 1 && arr[j] < arr[j - 1]) {
                swapElements(arr, j, j-1);
                j--;
            }
        }
    }

    public static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            boolean swapped = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapElements(arr, j, j + 1);
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }
    }
}
