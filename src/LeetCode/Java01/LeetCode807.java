package LeetCode.Java01;

/*
https://leetcode.com/problems/max-increase-to-keep-city-skyline/
 */

public class LeetCode807 {
    public static void main(String[] args) {

    }

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        int[] rowMax = new int[n];
        int[] colMax = new int[n];

        for (int i = 0; i < n; i++) {
            int max = grid[i][0];
            for (int j = 0; j < n; j++) {
                max = Math.max(max, grid[i][j]);
            }
            rowMax[i] = max;
        }

        for (int i = 0; i < n; i++) {
            int max = grid[0][i];
            for (int j = 1; j < n; j++) {
                max = Math.max(max, grid[j][i]);
            }
            colMax[i] = max;

        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans += Math.min(rowMax[i], colMax[j]) - grid[i][j];
            }

        }
        return ans;
    }
}
