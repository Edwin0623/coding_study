package Sep8;

import java.util.Scanner;


public class virus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // make a map
        int[][] map = {{1,0,0,0,0,0,1,2},{0,0,0,0,0,0,1,0},{0,0,0,0,0,0,1,1},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{2,0,0,0,0,0,0,1}};

        // print map
        printArr(map);

        while(true) {
            // get virus cell
            System.out.print("Input x ( 0 <= x <= 7 ) to get virus: ");
            int x_virus = sc.nextInt();
            System.out.print("Input y ( 0 <= y <= 7 ) to get virus: ");
            int y_virus = sc.nextInt();

            if (map[x_virus][y_virus] == 0) {
                System.out.println("Error: This is not a virus cell");
            } else if (map[x_virus][y_virus] == 1) {
                System.out.println("You get a yellow virus");
                System.out.print("Input x ( 0 <= x <= 7 ) to move: ");
                int x_new = sc.nextInt();
                System.out.print("Input y ( 0 <= y <= 7 ) to move: ");
                int y_new = sc.nextInt();
                if (map[x_new][y_new] != 0) {
                    System.out.println("Error: You can not put there");
                } else {
                    if (checkDistance(x_virus, y_virus, x_new, y_new) >= 3) {
                        System.out.println("Error: You can not put there");
                    } else if (checkDistance(x_virus, y_virus, x_new, y_new) < 3 && checkDistance(x_virus, y_virus, x_new, y_new) >= 2) {
                        // 2칸은 이동이니까 원래 있던 곳은 0, 새로 가는 곳은 1
                        map[x_virus][y_virus] = 0;
                        map[x_new][y_new] = 1;
                        // 이동하고 나서 주위에 감염 시키는 코드
                        for (int i = -1; i <= 1; i++) {
                            for (int j = -1; j <= 1; j++) {
                                if (x_new - i >= 0 && y_new - j >= 0 && x_new - i < 8 && y_new - j < 8) {
                                    // 이동 했을 때 주위 흰색은 강몀 안되게 하는 코드
                                    if (map[x_new - i][y_new - j] != 0) {
                                        map[x_new - i][y_new - j] = 1;
                                    }
                                }
                            }
                        }
                        printArr(map);
                    } else if (checkDistance(x_virus, y_virus, x_new, y_new) < 2 && checkDistance(x_virus, y_virus, x_new, y_new) >= 1) {
                        // 1칸은 복사니까 새로 가는 곳만 업데이트
                        map[x_new][y_new] = 1;
                        // 복사 하고나서 주위에 감염 시키는 코드
                        for (int i = -1; i <= 1; i++) {
                            for (int j = -1; j <= 1; j++) {
                                if (x_new - i >= 0 && y_new - j >= 0 && x_new - i < 8 && y_new - j < 8) {
                                    // 복사 했을 때 주위 흰색은 감염 안되게 하는 코드
                                    if (map[x_new - i][y_new - j] != 0) {
                                        map[x_new - i][y_new - j] = 1;
                                    }
                                }
                            }
                        }
                        printArr(map);
                    }
                }
            } else if (map[x_virus][y_virus] == 2) {
                System.out.println("You get a red virus");
                System.out.print("Input x ( 0 <= x <= 7 ) to do something: ");
                int x_new = sc.nextInt();
                System.out.print("Input y ( 0 <= y <= 7 ) to do something: ");
                int y_new = sc.nextInt();
                if (map[x_new][y_new] != 0) {
                    System.out.println("Error: You can not put there");
                } else {
                    if (checkDistance(x_virus, y_virus, x_new, y_new) >= 3) {
                        System.out.println("Error: You can not put there");
                    } else if (checkDistance(x_virus, y_virus, x_new, y_new) < 3 && checkDistance(x_virus, y_virus, x_new, y_new) >= 2) {
                        // 2칸은 이동이니까 원래 있던 곳은 0, 새로 가는 곳은 1
                        map[x_virus][y_virus] = 0;
                        map[x_new][y_new] = 2;
                        // 이동하고 나서 주위에 감염 시키는 코드
                        for (int i = -1; i <= 1; i++) {
                            for (int j = -1; j <= 1; j++) {
                                if (x_new - i >= 0 && y_new - j >= 0 && x_new - i < 8 && y_new - j < 8) {
                                    // 이동 했을 때 주위 흰색은 강몀 안되게 하는 코드
                                    if (map[x_new - i][y_new - j] != 0) {
                                        map[x_new - i][y_new - j] = 2;
                                    }
                                }
                            }
                        }
                        printArr(map);
                    } else if (checkDistance(x_virus, y_virus, x_new, y_new) < 2 && checkDistance(x_virus, y_virus, x_new, y_new) >= 1) {
                        // 1칸은 복사니까 새로 가는 곳만 업데이트
                        map[x_new][y_new] = 2;
                        // 복사 하고나서 주위에 감염 시키는 코드
                        for (int i = -1; i <= 1; i++) {
                            for (int j = -1; j <= 1; j++) {
                                if (x_new - i >= 0 && y_new - j >= 0 && x_new - i < 8 && y_new - j < 8) {
                                    // 복사 했을 때 주위 흰색은 감염 안되게 하는 코드
                                    if (map[x_new - i][y_new - j] != 0) {
                                        map[x_new - i][y_new - j] = 2;
                                    }
                                }
                            }
                        }
                        printArr(map);
                    }
                }
            }
        }

    }

    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int checkDistance(int x, int y, int x1, int y1) {
        int dx = x1 - x;
        int dy = y1 - y;
        double distance = Math.sqrt((dx * dx) + (dy * dy));

        return (int)distance;
    }
}
