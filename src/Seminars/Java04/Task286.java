package Seminars.Java04;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/*
https://leetcode.com/problems/walls-and-gates/
 */

public class Task286 {
    static final int EMPTY = Integer.MAX_VALUE;
    static final int GATE = 0;
    //    static final int WALL = -1;
    static final int[][] DIRECTIONS = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public static void wallsAndGates(int[][] rooms) {
        Queue<int[]> q = new LinkedList<>();

        for (int row = 0; row < rooms.length; row++) {
            for (int col = 0; col < rooms[0].length; col++) {
                if (rooms[row][col] == GATE) {
                    q.add(new int[]{row, col});
                }
            }
        }

        while (!q.isEmpty()) {
            int[] curPoint = q.poll();
            int curRow = curPoint[0];
            int curCol = curPoint[1];
            for (int[] direction : DIRECTIONS) {
                int newRow = curRow + direction[0];
                int newCol = curCol + direction[1];
                if (newRow < 0 || newCol < 0
                        || newRow >= rooms.length || newCol >= rooms[0].length
                        || rooms[newRow][newCol] != EMPTY) {
                    continue;
                }
                rooms[newRow][newCol] = rooms[curRow][curCol] + 1;
                q.add(new int[]{newRow, newCol});
            }

        }
    }

    private static void printBoard(int[][] rooms) {
        for (var r : rooms) {
            System.out.println(Arrays.toString(r));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] rooms =
                        {{2147483647, -1, 0, 2147483647},
                        {2147483647, 2147483647, 2147483647, -1},
                        {2147483647, -1, 2147483647, -1},
                        {0, -1, 2147483647, 2147483647}};
//        printBoard(rooms);
        wallsAndGates(rooms);
        printBoard(rooms);
    }
}

