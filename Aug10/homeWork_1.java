package Aug10;

public class homeWork_1 {
    /*
        Change as a new array with the same array.
        1,2,3       9,8,7
        4,5,6  -->  6,5,4
        7,8,9       3,2,1
     */
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == 1) {
                    int save = arr[1][0];
                    arr[1][0] = arr[1][2];
                    arr[1][2] = save;
                }
                int save = arr[i][j];
                arr[i][j] = arr[(arr.length - 1) - i][(arr.length - 1) - j];
                arr[(arr.length - 1) - i][(arr.length - 1) - j] = save;
            }

        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
