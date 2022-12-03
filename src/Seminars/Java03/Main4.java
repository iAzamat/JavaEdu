package Seminars.Java03;

/*
Обойти конем доску так, чтобы конь посетил каждую клеточку 1 раз
 */

import java.util.Arrays;

public class Main4 {
    static int[][] board;
    static int[][] moves = {{1, 2}, {-1, 2}, {1, -2}, {-1, -2},
            {2, 1}, {-2, 1}, {2, -1}, {-2, -1}};
    static int k = 0;
    static int size;


    private static boolean canPlace(int i, int j) {
        return i >= 0 && i < board.length && j >= 0 && j < board.length && board[i][j] == 0;
    }

    public static void horseBackTrack(int i, int j, int step) {
        board[i][j] = step;
        if (step == size) {
            printBoard();
            board[i][j] = 0;
            return;
        }
        for (int[] move : moves) {
            int newI = i + move[0];
            int newJ = j + move[1];
            if (canPlace(newI, newJ)) {
                horseBackTrack(newI, newJ, step + 1);
            }
        }
        board[i][j] = 0;
    }

    private static void printBoard() {
        System.out.println("Case " + ++k);
        for (var r : board) {
            System.out.println(Arrays.toString(r));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 5;
        size = n * n;
        board = new int[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                horseBackTrack(i, j, 1);
            }
        }

    }
}
