package Nov02;

public class homeWork5 {
    /*
        5) String 배열이 주어지면 가장 많이 존재하는 원소 값을 프린트하시오
            ex) Apple Apple Banana Apple Diq
                --------
                Apple
     */
    public static void main(String[] args) {
        String[] arr = { "Apple", "Banana", "Banana", "Banana", "Orange" };
        int[] data = new int[arr.length];

        //selectionSort(arr);
        printArr(arr);
        findElement(arr, data);
    }

    public static void printArr(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void selectionSort(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[index]) < 0) {
                    index = j;
                }
            }
            String temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }

    public static void findElement(String[] arr, int[] data) {
        int max_index = 0;
        for (int i = 0; i < arr.length; i++) {
            // 무조건 하나씩은 배열안에 존재 하니까 count 는 1부터 시작한다.
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            // 몇개인지 세알리고 data 배열에 저장한다. 위치는 arr 의 위치와 같다.
            data[i] = count;
        }

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();

        System.out.println(max_index);
        System.out.println(arr[max_index]);
    }
}

/*
2 1 1 1 1
 */
