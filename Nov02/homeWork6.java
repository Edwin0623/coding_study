package Nov02;

public class homeWork6 {
    /*
        6) 정수 배열과 N이 주어지면 원소 두개끼리 합쳐서 N이 되는 모든 경우를 프린트하시오
        { 3, 4, 5, 7, 2, 6, 6 }, 10
        ----------
        3, 7
        4, 6
        4, 6
     */
    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 7, 2, 6, 6 };
        int N = 10;
        printFindedElementsForSum(arr, N);
    }

    public static void printFindedElementsForSum(int[] arr, int a) {
        // 못 찾을 경우 결과값을 나타내주기 위해 'boolean'을 'false'로 둔다
        boolean find = false;
        for (int i = 0; i < arr.length; i++) {
            int element_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[element_index] + arr[j] == a) {
                    find = true;
                    System.out.println(arr[element_index] + ", " + arr[j]);
                }
            }
        }
        if (find == false) {
            System.out.println("There is no result!!");
        }
    }
}
