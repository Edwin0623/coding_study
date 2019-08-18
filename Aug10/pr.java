package Aug10;

public class pr {
    public static void main(String[] args) {
        int x = 5;
        int y = 5;

        int[][] arr = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (i - j == 0) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
}
