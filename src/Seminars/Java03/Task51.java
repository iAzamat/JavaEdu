package Seminars.Java03;

/*
https://leetcode.com/problems/n-queens/
 */

import java.util.ArrayList;
import java.util.List;

public class Task51 {

    static int[][] board;
    static List<List<String>> ans;

    public static void main(String[] args) {
        int n = 5;
        board = new int[n][n];
        System.out.println(solveNQueens(5));
    }

    public static List<List<String>> solveNQueens(int n) {
        board = new int[n][n];
        ans = new ArrayList<>();
        backtrack(0);

        return ans;
    }

    // сюда приходит
    private static void backtrack(int col) {
        if (col == board.length) {
            addBoard();
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (canPlace(row, col)) {
                board[row][col] = 1;
                backtrack(col + 1);
                board[row][col] = 0;
            }
        }
    }

    private static boolean canPlace(int i, int j) {
        // налево
        for (int col = j - 1; col >= 0; col--) {
            if (board[i][col] == 1) return false;
        }

        // вверх по диаг
        for (int row = i - 1, col = j - 1; row >= 0 && col >= 0; row--, col--) {
            if (board[row][col] == 1) return false;
        }

        // вниз по диаг
        for (int row = i + 1, col = j - 1; row < board.length && col >= 0; row++, col--) {
            if (board[row][col] == 1) return false;
        }
        return true;
    }

    private static void addBoard() {
        List<String> b = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < board.length; j++) {
                sb.append(board[i][j] == 0 ? '.' : 'Q');
            }
            b.add(sb.toString());
        }
        ans.add(b);
    }
}
