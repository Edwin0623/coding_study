package Aug18;

public class ascii_code {
    /*
        < 문자, 특수문자, 숫자는 아스키코드로 변환가능 >
        크기256의 빈 배열을 만들고, 스트링에 있는 캐릭터를 아스키코드로 바꾸고 그에 해당하는 배열 인덱스에 +1씩 해준다.
        ex)
        (int)'H' = 72 (ASCII)
        arr['H' or 72] = 1
     */
    public static void main(String[] args) {
        int[] arr = new int[256];

        String sentence = "Hello World!";
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            arr[c]++;
        }

        printArrWithValue(arr);

        int maxValue = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[maxValue]) {
                maxValue = i;
            }
        }
        System.out.println("The Highest value Character = " + (char)maxValue);
        System.out.println("The Highest value = " + arr[maxValue]);

    }
    public static void printArrWithValue(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.println("arr[" + i + "] = " + arr[i] + " -> " + (char)i);
            }
        }
    }
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i  + "] = " + arr[i]);
        }
    }
}
