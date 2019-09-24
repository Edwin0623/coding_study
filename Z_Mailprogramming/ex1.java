package Z_Mailprogramming;

import java.util.Scanner;

public class ex1 {
    /*
        0: white, 1: yellow, 2: red
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // print map
        printArr();

        // get virus cell


    }

    public static void map() {

    }

    public static void printArr() {
        int[][] map = {{1,0,0,0,0,0,1,2},{0,0,0,0,0,0,1,0},{0,0,0,0,0,0,1,1},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{2,0,0,0,0,0,0,1}};

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
