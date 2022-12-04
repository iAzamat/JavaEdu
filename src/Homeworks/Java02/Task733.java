package Homeworks.Java02;

/*
https://leetcode.com/problems/flood-fill/
 */

import java.util.Arrays;

public class Task733 {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int sr = 1;
        int sc = 1;
        int color = 2;
        print(image);
        floodFill(image, sr, sc, color);
        print(image);
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        dfs(image, sr, sc, newColor, image[sr][sc]);
        return image;
    }

    public static void dfs(int[][] img, int i, int j, int col, int target) {
        if (i < 0 || i >= img.length || j < 0 || j >= img[0].length || img[i][j] != target || img[i][j] == col) {
            return;
        }
        img[i][j] = col;
        dfs(img, i + 1, j, col, target);
        dfs(img, i - 1, j, col, target);
        dfs(img, i, j + 1, col, target);
        dfs(img, i, j - 1, col, target);

    }

    private static void print(int[][] board) {
        for (var r : board) {
            System.out.println(Arrays.toString(r));
        }
        System.out.println();
    }
}
