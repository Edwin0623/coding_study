package Nov02;

import java.util.Scanner;

public class homeWork1 {
    /*
        1) 숫자 N을 받아 N개의 이름을 받고 이름을 알파벳 순으로 정렬하여 프린트 하라
           (오름차순 1번, 내림차순 1번)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type an positive Integer: ");
        int N = sc.nextInt();
        String[] arr = new String[N];
        makeArr(arr);
        selectionSort(arr);
        printArr(arr);
        selectionSort_reverse(arr);
        printArr(arr);
    }

    public static void makeArr(String[] arr) {
        // 이름을 입력받고 배열로 만든다
        Scanner sc = new Scanner(System.in);
        System.out.println("Type some words");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
        }
    }

    public static void selectionSort(String[] arr) {
        // 오름차순으로 만들어줌
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

    public static void selectionSort_reverse(String[] arr) {
        // 내림차순으로 만들어줌
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[index]) > 0) {
                    index = j;
                }
            }
            String temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }

    private static void printArr(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}


