package Jul31;

public class class02 {
    /*
        한 배열안에서 원소들끼리 더해서 특정 수가 나오게 효율적으로 코딩 하기
        input: {1,2,3,4,6,8,10}
        찾는수: k = 5
        output: 1 and 4
     */
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,8,10};
        int k = 5;

        // i = 배열 왼쪽에서 오른쪽으로 이동하게 함
        int i = 0;
        // j = 배열 오른쪽에서 왼쪽으로 이동하게 함
        int j = arr.length - 1;

        boolean found = false;
        while (i < j) {
            // 1 + 10 > 5 이므로 j가 배열의 오른쪽에서 왼쪽으로 이동하면 더했을 때 값이 작아짐
            if (arr[i] + arr[j] > k) {
                j--;
            }
            // 1 + 3 < 5 이므로 i가 배열의 왼쪽에서 오른쪽으로 이동하면 더했을 때 값이 커짐
            else if (arr[i] + arr[j] < k) {
                i++;
            }
            // i + j = k 일때 이므로 'boolean = true' 가 되게 하고 찾았다고 프린트
            else {
                found = true;
                System.out.println("Found: " + arr[i] + " and " + arr[j]);
                break;
            }
        }
        // 못 찾는 경우도 있을 수 있으므로 못 찾았다고 프린트
        if (found == false) {
            System.out.println("Not Found!");
        }
    }
}
