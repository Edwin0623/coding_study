package Nov02;

import java.util.Scanner;

public class homeWork2 {
    /*
        2) 숫자 N을 받고 이름(문자)과 성적(정수)을 N개 받는다. 가장 성적이 좋은 사람과 가장 성적이 나쁜 사람의 이름을 프린트
            예)
            3
            Alex
            90
            Insoo
            99
            Sechang
            100
            ---------------
            Sechang
            Alex
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an positive Integer: ");
        // 몇명의 이름과 점수를 받을지 먼저 물어본다
        int N = sc.nextInt();
        String[] arr_name = new String[N];
        int[] arr_score = new int[N];

        makeArr(arr_name, arr_score);
        selectionSort(arr_name, arr_score);
        printName(arr_name);
    }

    // 사용자 한테 이름과 점수를 순서대로 받음
    public static void makeArr(String[] arr1, int[] arr2) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type name and score");

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.next();
            arr2[i] = sc.nextInt();
        }
    }

    // 점수가 낮은 순서대로 Sort를 하고, 이름도 같은 순서대로 Sort 해줌
    public static void selectionSort(String[] arr1, int[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr2.length; j++) {
                if (arr2[j] < arr2[min_index]) {
                    min_index = j;
                }
            }
            // 점수를 가지고 먼저 Sort
            int temp_score = arr2[i];
            arr2[i] = arr2[min_index];
            arr2[min_index] = temp_score;

            // 그때 index를 가지고 이름도 같이 Sort
            String temp_name = arr1[i];
            arr1[i] = arr1[min_index];
            arr1[min_index] = temp_name;
        }
    }

    // 가장 잘한 사람과 못한 사람의 이름을 프린트 해준다
    public static void printName(String[] arr) {
        System.out.println("가장 개 잘하는 애");
        System.out.println(arr[arr.length - 1]);
        System.out.println("공부 존나 못한 애");
        System.out.println(arr[0]);
    }
}
