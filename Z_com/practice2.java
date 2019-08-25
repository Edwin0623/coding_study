package Z_com;

public class practice2 {
    public static void main(String[] args) {
        int[] arr = new int[256];

        String input = "Hello world! I'm Muhyun";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            arr[c]++;     // arr[(int)c]++ 와 같다.
        }

        printArr(arr);
        char a = ' ';
        System.out.println((int)a);

    }
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " +  arr[i]);
        }
    }
}

