package Jun8;

import java.util.Scanner;

public class array2 {
    /*
        사이즈가 5인 빈 정수 배열을 만들고, 사용자가 원소를 입력하게 만드시오
        Make an empty Int array and let user put elements into the array
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5]; // Make an Int array: size 5

        // 5번만큼 반복할때 'Scanner'를 이용해서 배열의 원소를 사용자가 넣게 한다.
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter a element for(" + (i+1) + "/5): ");
            int n = sc.nextInt(); // Let users input elements for array 'a'
            arr[i] = n;
        }

        // 사용자가 만든 배열을 출력
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}

