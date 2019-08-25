package Aug10;

public class homeWork2 {
    /*
        123       741
        456  -->  852
        789       963

        Idea: i = 0, j = 0,1,2 ---> j = 2, i = 0,1,2
              i = 1, j = 0,1,2 ---> j = 1, i = 0,1,2
              i = 2, j = 0,1,2 ---> j = 0, i = 0,1,2
     */
    public static void main(String[] args) {
        int[][] data = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] changed_data = new int[3][3];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                changed_data[j][data.length - 1 - i] = data[i][j];
            }
        }

        for (int i = 0; i < changed_data.length; i++) {
            for (int j = 0; j < changed_data[i].length; j++) {
                System.out.print(changed_data[i][j]);
            }
            System.out.println();
        }
    }

}
