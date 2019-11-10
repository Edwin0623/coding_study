package Nov02;

public class homeWork4 {
    /*
        4) 'String'배열과 'String'이 주어지면 주어진 'String'이 배열안에 몇개 존재하는지 리턴하시오.
     */
    public static void main(String[] args) {
        String[] arr = { "apple", "banana", "apple", "apple", "orange" };
        String str = "apple";
        System.out.println(countHowManyStringInTheArray(arr, str));
    }

    public static int countHowManyStringInTheArray(String[] arr, String a) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (a == arr[i]) {
                count++;
            }
        }
        return count;
    }
}
