package Homeworks.Java04;

/*
https://leetcode.com/problems/01-matrix/
 */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Task542 {
    public static void main(String[] args) {
        int[][] mat = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        System.out.println("Example 1");
        System.out.println("Input:");
        printBoard(mat);
        updateMatrix(mat);
        System.out.println("Output:");
        printBoard(mat);

        int[][] mat2 = {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        System.out.println("Example 2");
        System.out.println("Input:");
        printBoard(mat2);
        updateMatrix(mat2);
        System.out.println("Output:");
        printBoard(mat2);
    }

    static final int EMPTY = Integer.MAX_VALUE;
    static final int[][] DIRECTIONS = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public static int[][] updateMatrix(int[][] mat) {
        Queue<int[]> q = new LinkedList<>();

        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                if (mat[row][col] == 0) {
                    q.add(new int[]{row, col});
                } else {
                    mat[row][col] = EMPTY;
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
                if (newRow >= 0 && newCol >= 0
                        && newRow < mat.length && newCol < mat[0].length
                        && mat[newRow][newCol] == EMPTY) {
                    mat[newRow][newCol] = mat[curRow][curCol] + 1;
                    q.add(new int[]{newRow, newCol});
                }
            }
        }
        return mat;
    }

    private static void printBoard(int[][] rooms) {
        for (var r : rooms) {
            System.out.println(Arrays.toString(r));
        }
        System.out.println();
    }
}


//class Solution {
//    static final int EMPTY = Integer.MAX_VALUE;
//    static final int[][] DIRECTIONS = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
//
//
//    public int[][] updateMatrix(int[][] mat) {
//        Queue<int[]> q = new LinkedList<>();
//
//        for (int row = 0; row < mat.length; row++) {
//            for (int col = 0; col < mat[0].length; col++) {
//                if (mat[row][col] == 0) {
//                    q.add(new int[]{row, col});
//                } else {
//                    mat[row][col] = EMPTY;
//                }
//            }
//        }
//
//        while (!q.isEmpty()) {
//            int[] curPoint = q.poll();
//            int curRow = curPoint[0];
//            int curCol = curPoint[1];
//            for (int[] direction : DIRECTIONS) {
//                int newRow = curRow + direction[0];
//                int newCol = curCol + direction[1];
//                if (newRow >= 0 && newCol >= 0
//                        && newRow < mat.length && newCol < mat[0].length
//                        && mat[newRow][newCol] == EMPTY) {
//                    mat[newRow][newCol] = mat[curRow][curCol] + 1;
//                    q.add(new int[]{newRow, newCol});
//                }
//            }
//        }
//        return mat;
//    }
//}