package Aug18Homework;

public class homework_muhyun {
    /*
        두 행렬을 곱하기 한 행렬을 나오게 하기
        matrix multiplication: (i x k) x (k x j) = (i x j)

        1 2 3     1 2     22 28
        4 5 6  x  3 4  =  49 64
                  5 6
     */
    public static void main(String[] args) {
        int[][] a1 = {{1,2,3},{4,5,6}};
        int[][] a2 = {{1,2},{3,4},{5,6}};

        int x = a1.length;
        int y = a2[0].length;

        int[][] a3 = new int[x][y];


        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                int tempSum = 0;
                for (int k = 0; k < a1[0].length; k++) {
                    tempSum = tempSum + (a1[i][k] * a2[k][j]);
                    a3[i][j] = tempSum;
                }
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(a3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
