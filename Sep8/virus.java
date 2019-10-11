package Sep8;

import java.util.Scanner;

public class virus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // make a map
        int[][] map = getMap();
        // turn is started from 1.
        int turn = 1;
        int player1Score = 0;
        int player2Score = 0;

        game(map, turn, player1Score, player2Score);
    }
    public static int[][] getMap() {
        int[][] map = {{1, 0, 0, 0, 0, 0, 1, 2},
                       {0, 0, 0, 0, 0, 1, 1, 1},
                       {0, 0, 0, 0, 0, 1, 1, 1},
                       {0, 0, 0, 0, 0, 0, 0, 0},
                       {0, 0, 0, 0, 0, 0, 0, 0},
                       {1, 1, 1, 0, 0, 0, 0, 0},
                       {1, 1, 1, 0, 0, 0, 0, 0},
                       {2, 1, 1, 0, 0, 0, 0, 1}};
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
    public static int getCellDist(int x_cell, int y_cell, int x_new, int y_new) {
        int dist;
        if (Math.abs(x_new - x_cell) <= Math.abs(y_new - y_cell)) {
            dist = Math.abs(y_new - y_cell);
        } else {
            dist = Math.abs(x_new - x_cell);
        }
        return dist;
    }
    public static int[] showScore(int[][] arr, int player1Score, int player2Score) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 1) {
                    player1Score++;
                }
                if (arr[i][j] == 2) {
                    player2Score++;
                }
            }
        }
        System.out.println(player1Score + " vs " + player2Score);
        int[] scoreArr = {player1Score, player2Score};
        return scoreArr;
    }
    public static boolean checkScoreIsZero(int[] scoreArr) {
        boolean scoreCheck = false;
        if (scoreArr[0] == 0 || scoreArr[1] == 0) {
            scoreCheck = true;
        }
        return scoreCheck;
    }
    public static boolean checkSurroundTheCell(int[][] arr, int x, int y) {
        // Check surround that can be shown 5 to move user's cell
        boolean checkSurround = false;
        for (int i = -2; i <= 2; i++) {
            for (int j = -2; j <= 2; j++) {
                if (x - i >= 0 && y - j >= 0 && x - i < arr.length && y - j < arr[0].length) {
                    if (arr[x - i][y - j] == 0) {
                        checkSurround = true;
                    }
                }
            }
        }
        return checkSurround;
    }
    public static boolean checkWholeMapFor1(int[][] arr) {
        boolean checkWholeMapFor1 = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 1 && checkSurroundTheCell(arr, i, j) == true) {
                    checkWholeMapFor1 = true;
                }
            }
        }
        return checkWholeMapFor1;
    }
    public static boolean checkWholeMapFor2(int[][] arr) {
        boolean checkWholeMapFor2 = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 2 && checkSurroundTheCell(arr, i, j) == true) {
                    checkWholeMapFor2 = true;
                }
            }
        }
        return checkWholeMapFor2;
    }
    public static void greyOn(int[][] arr, int x, int y) {
        // show 5 user can move
        for (int i = -2; i <= 2; i++) {
            for (int j = -2; j <= 2; j++) {
                if (x - i >= 0 && y - j >= 0 && x - i < arr.length && y - j < arr[0].length) {
                    if (arr[x - i][y - j] == 0) {
                        arr[x - i][y - j] = 5;
                    }
                }
            }
        }
        printMap(arr);
    }
    public static void greyOff(int[][] arr, int x, int y) {
        // Off 5
        for (int i = -2; i <= 2; i++) {
            for (int j = -2; j <= 2; j++) {
                if (x - i >= 0 && y - j >= 0 && x - i < arr.length && y - j < arr[0].length) {
                    if (arr[x - i][y - j] != 1 && arr[x - i][y - j] != 2) {
                        arr[x - i][y - j] = 0;
                    }
                }
            }
        }
    }

    public static void virus(int[][] arr, int x_new, int y_new, int turn) {
        // Infect surrounding cells after moving to the destination coordinates.
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (x_new - i >= 0 && y_new - j >= 0 && x_new - i < arr.length && y_new - j < arr[0].length) {
                    // 이동 했을 때 주위 흰색은 강몀 안되게 하는 코드
                    if (arr[x_new - i][y_new - j] != 0) {
                        arr[x_new - i][y_new - j] = turn;
                    }
                }
            }
        }
        System.out.println();
    }
    public static void game(int[][] map, int turn, int player1Score, int player2Score) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            if (checkScoreIsZero(showScore(map, player1Score, player2Score)) || (checkWholeMapFor1(map) && checkWholeMapFor2(map))) {
                printMap(map);
                System.out.println("Player " + turn + "'s turn!");
                // Get source coordinates of the cell of Player want to move.
                System. out.print("Input 'x' to get a cell on the map: ");
                int x_cell = sc.nextInt();
                System.out.print("Input 'y' to get a cell on the map: ");
                int y_cell = sc.nextInt();

                // 맵 밖 좌표를 찍으면 다시 찍으라고 해줌
                if (x_cell >= 0 && y_cell >= 0 && x_cell < map.length && y_cell < map.length) {
                    // 자신의 'turn'에 맞는 'cell'을 골랐는지 먼저 체크 한다
                    if (map[x_cell][y_cell] == turn) {

                        // 자신의 'cell'을 골랐고, 주위에 0이 1개라도 있으면 옮길 수 있는 곳을 보여 준다
                        if (checkSurroundTheCell(map, x_cell, y_cell)) {
                            greyOn(map, x_cell, y_cell);
                        } else {
                            System.out.println("Error: You can not choose it!!" + "\n");
                            continue;
                        }

                        while (true) {
                            // Get destination coordinates of the cell I want to move to.
                            System.out.print("Input 'x' you want to move: ");
                            int x_new = sc.nextInt();
                            System.out.print("Input 'y' you want to move: ");
                            int y_new = sc.nextInt();
                            int dist = getCellDist(x_cell, y_cell, x_new, y_new);

                            // 5를 고를 떄 -> 'turn'이 끝나는 유일한 조건
                            if (map[x_new][y_new] == 5) {
                                // 1칸이면 복사하면서 이동
                                if (dist == 1) {
                                    map[x_new][y_new] = turn;
                                }
                                // 2칸이면 이동
                                if (dist == 2) {
                                    map[x_new][y_new] = turn;
                                    map[x_cell][y_cell] = 0;
                                }
                                greyOff(map, x_cell, y_cell);
                                // 이동한 뒤에 주위 감염 시킴
                                virus(map, x_new, y_new, turn);
                                // 턴 종료!
                                break;
                            }
                            // 자신의 'Cell'을 또 고를 때
                            else if (map[x_new][y_new] == turn) {
                                greyOff(map, x_cell, y_cell);
                                x_cell = x_new;
                                y_cell = y_new;
                                greyOn(map, x_new, y_new);
                                // 이동할 곳 다시 고르게 하기위해 while loop 처음으로 이동
                                continue;
                            }
                            // 거리가 2칸보다 클 때
                            else if (dist > 2 && map[x_new][y_new] == 0) {
                                System.out.println("Error: You tried to move too much!!" + "\n");
                                printMap(map);
                                // 이동할 곳 다시 고르게 하기위해 while loop 처음으로 이동
                                continue;
                            }
                            // 상대방 'cell'에 놓으려고 할 때
                            else {
                                System.out.println("Error: You can not put there!" + "\n");
                                printMap(map);
                                // 이동할 곳 다시 고르게 하기위해 while loop 처음으로 이동
                                continue;
                            }
                        }
                    } else {
                        // 각자의 'turn'에 맞는 'cell'을 고르지 않을 때
                        System.out.println("Error: Choose your cell!!" + "\n");
                        continue;
                    }
                } else {
                    // 맵 밖에 클릭 할 때
                    System.out.println("Error: Choose a cell inside of map!!" + "\n");
                    continue;
                }
                turn = turn % 2 + 1;
            } else {
                printMap(map);
                showScore(map, player1Score, player2Score);
                System.out.println("Game Ended!" + "\n" + "player " + (turn % 2 + 1) + " is win!!");
                break;
            }
        }
    }
}
