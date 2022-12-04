package Seminars.Java05;

import java.util.HashMap;
import java.util.Map;

/*
https://leetcode.com/problems/check-array-formation-through-concatenation/submissions/
 */

public class Task1640 {
    public static boolean canFormArray(int[] arr, int[][] pieces) {
        // piece[0] - piece
        Map<Integer, int[]> map = new HashMap<>();

        for (var piece : pieces) {
            map.put(piece[0], piece);
        }
        int i = 0;
        while (i < arr.length) {
            if (!map.containsKey(arr[i])) {
                return false;
            }
            int[] piece = map.get(arr[i]);
            for (var x : piece) {
                if (x != arr[i]) {
                    return false;
                }
                i++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Example 1
        int[] arr = new int[]{15, 88};
        int[][] pieces = new int[][]{{88}, {15}};
        System.out.println("Example 1: " + canFormArray(arr, pieces));

        // Example 2
        int[] arr2 = new int[]{49, 18, 16};
        int[][] pieces2 = new int[][]{{16, 18, 49}};
        System.out.println("Example 2: " + canFormArray(arr2, pieces2));

        // Example 3
        int[] arr3 = new int[]{91, 4, 64, 78};
        int[][] pieces3 = new int[][]{{78}, {4, 64}, {91}};
        System.out.println("Example 3: " + canFormArray(arr3, pieces3));
    }
}