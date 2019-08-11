import java.util.Scanner;

// 정수(n)를 입력하면 n만큼 입력하고 최대값, 최소값 구하기. 

public class Insoo {
    public static void main(String[] args) {

        Scanner maxMin = new Scanner(System.in);
//        System.out.print("Enter an Integer(n): ");
//        int n = maxMin.nextInt();
        System.out.print("Enter Integers for n: ");
        String str = maxMin.next();
        String[] strArr = str.split(" ");
        int max = 0;
        int min = 0;
        for (String word : strArr) {
            int a = Integer.parseInt(word);
            if (a>=max) {
                max = a;
            }
            if (a<=min) {
                min = a;
            }
        }

//        int max = 0;
//        int min = 0;
//
//        for (int i=1; i<=n; i=i+1) {
//            int a = maxMin.nextInt();
//
//            if (i==1){
//                max = a;
//                min = a;
//            }
//            if (a>max) {
//                max = a;
//            }
//            if (a<min) {
//                min = a;
//            }
//        }
        maxMin.close();
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}