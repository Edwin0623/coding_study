package com;

public class practice2 {
    /*
        Change as a new array with the same array.
        1,2,3       9,8,7
        4,5,6  -->  6,5,4
        7,8,9       3,2,1
     */
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        printArr(reverse(arr));

    }
    public static int[][] reverse(int[][] arr) {
        int[][] newArr = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                newArr[i][j] = arr[(arr[0].length - 1) - i][(arr.length  - 1) - j];
            }
        }
        return newArr;
    }
    public static void printArr(int[][] newArr) {
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[0].length; j++) {
                System.out.print(newArr[i][j]);
            }
            System.out.println();
        }
    }

}
