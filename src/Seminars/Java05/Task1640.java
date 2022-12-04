package Seminars.Java05;

import java.util.HashMap;
import java.util.Map;

/*
https://leetcode.com/problems/check-array-formation-through-concatenation/submissions/
 */

public class Task1640 {
}


//class Solution {
//    public boolean canFormArray(int[] arr, int[][] pieces) {
//        // piece[0] - piece
//        Map<Integer, int[]> map = new HashMap<>();
//
//        for (var piece : pieces) {
//            map.put(piece[0], piece);
//        }
//        int i = 0;
//        while (i < arr.length) {
//            if (!map.containsKey(arr[i])) {
//                return false;
//            }
//            int[] piece = map.get(arr[i]);
//            for (var x : piece) {
//                if (x != arr[i]) {
//                    return false;
//                }
//                i++;
//            }
//        }
//        return true;
//    }
//}