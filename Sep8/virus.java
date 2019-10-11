package Sep8;

import java.util.Scanner;

public class virus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // make a map
        int[][] map = getMap();
        int turn = 1;

        while (true) {
            // turn is started from 1.
            System.out.println("Player " + turn + "'s turn!");
            showScore(map);
            printMap(map);

            if (checkScoreIsZero(showScore(map))) {
                System.out.println("Game Over" + "\n" + "Player " + turn + " win!");
                break;
            } else {
                // Get source coordinates of the cell of Player want to move.
                System.out.print("Input 'x' to get a cell on the map: ");
                int x_virus = sc.nextInt();
                System.out.print("Input 'y' to get a cell on the map: ");
                int y_virus = sc.nextInt();

                // 맵 밖 좌표를 찍으면 다시 찍으라고 해줌
                if (x_virus >= 0 && y_virus >= 0 && x_virus < map.length && y_virus < map.length) {
                    // 플레이어 1인데 2 장기말을 선택하면 다시 선택하라고 해줌
                    if (map[x_virus][y_virus] == turn) {
                        game(map, x_virus, y_virus);
                        turn = (turn % 2) + 1;
                    } else {
                        System.out.println("Error: You must select player " + turn + "'s 장기말" + "\n");
                        continue;
                    }
                } else {
                    System.out.println("Error: Put x,y inside of map!!" + "\n");
                    continue;
                }
            }

        }
    }
    public static int[][] getMap() {
        int[][] map = {{1, 2, 0, 0, 0, 0, 1, 1},
                       {0, 0, 0, 0, 0, 0, 1, 0},
                       {0, 0, 0, 0, 0, 0, 1, 1},
                       {0, 0, 0, 0, 0, 0, 0, 0},
                       {0, 0, 0, 0, 0, 0, 0, 0},
                       {0, 0, 0, 0, 0, 0, 0, 0},
                       {0, 0, 0, 0, 0, 0, 0, 0},
                       {1, 0, 0, 0, 0, 0, 0, 1}};
        return map;
    }
    public static void printMap(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int getCellDist(int x_virus, int y_virus, int x_new, int y_new) {
        int dist;
        if (Math.abs(x_new - x_virus) <= Math.abs(y_new - y_virus)) {
            dist = y_new - y_virus;
        } else {
            dist = x_new - x_virus;
        }

        if (dist < 0) {
            dist = dist * -1;
        }
        return dist;
    }
    public static int[] showScore(int[][] arr) {
        String player1Score = "";
        String player2Score = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 1) {
                    player1Score = player1Score.concat("1");
                }
                if (arr[i][j] == 2) {
                    player2Score = player2Score.concat("2");
                }
            }
        }
        System.out.println(player1Score.length() + " vs " + player2Score.length());
        int[] score = {player1Score.length(), player2Score.length()};
        return score;
    }
    public static boolean checkScoreIsZero(int[] score) {
        boolean scoreCheck = false;
        if (score[0] == 0 || score[1] == 0) {
            scoreCheck = true;
        }
        return scoreCheck;
    }
    public static void greyOn(int[][] arr, int x_virus, int y_virus) {
        for (int i = -2; i <= 2; i++) {
            for (int j = -2; j <= 2; j++) {
                if (x_virus - i >= 0 && y_virus - j >= 0 && x_virus - i < arr.length && y_virus - j < arr[0].length) {
                    if (arr[x_virus - i][y_virus - j] == 0) {
                        arr[x_virus - i][y_virus - j] = 5;
                    }
                }
            }
        }
        printMap(arr);
    }
    public static void greyOff(int[][] arr, int x_virus, int y_virus) {
        for (int i = -2; i <= 2; i++) {
            for (int j = -2; j <= 2; j++) {
                if (x_virus - i >= 0 && y_virus - j >= 0 && x_virus - i < arr.length && y_virus - j < arr[0].length) {
                    if (arr[x_virus - i][y_virus - j] != 1 && arr[x_virus - i][y_virus - j] != 2) {
                        arr[x_virus - i][y_virus - j] = 0;
                    }
                }
            }
        }
    }
    public static void virus(int[][] arr, int x_new, int y_new) {
        // Infect surrounding cells after moving to the destination coordinates.
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (x_new - i >= 0 && y_new - j >= 0 && x_new - i < arr.length && y_new - j < arr[0].length) {
                    // 이동 했을 때 주위 흰색은 강몀 안되게 하는 코드
                    if (arr[x_new - i][y_new - j] != 0) {
                        arr[x_new - i][y_new - j] = arr[x_new][y_new];
                    }
                }
            }
        }
    }
    public static void game(int[][] map, int x_virus, int y_virus) {
        Scanner sc = new Scanner(System.in);
        greyOn(map, x_virus, y_virus);

        // Get destination coordinates of the cell I want to move to.
        System.out.print("Input 'x' you want to move: ");
        int x_new = sc.nextInt();
        System.out.print("Input 'y' you want to move: ");
        int y_new = sc.nextInt();
        int dist = getCellDist(x_virus, y_virus, x_new, y_new);

        if (map[x_new][y_new] == 5) {
            if (dist == 1) {
                map[x_new][y_new] = map[x_virus][y_virus];
            } else if (dist == 2) {
                map[x_new][y_new] = map[x_virus][y_virus];
                map[x_virus][y_virus] = 0;
            } else {
                System.out.println("You tried to move too much");
            }
            greyOff(map, x_virus, y_virus);
            virus(map, x_new, y_new);
        } else {
            System.out.println("You can not put there");
        }
        System.out.println();
    }
}