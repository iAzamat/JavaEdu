package Homeworks.Java05;

/*
https://leetcode.com/problems/contains-duplicate-ii/
 */

import java.util.HashMap;
import java.util.Map;

public class Task219 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 1};
        int k1 = 3;
        System.out.println("Example 1: " + containsNearbyDuplicate(nums1, k1));
        int[] nums2 = new int[]{1, 0, 1, 1};
        int k2 = 1;
        System.out.println("Example 2: " + containsNearbyDuplicate(nums2, k2));
        int[] nums3 = new int[]{1, 2, 3, 1, 2, 3};
        int k3 = 2;
        System.out.println("Example 3: " + containsNearbyDuplicate(nums3, k3));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && (i - map.get(nums[i]) <= k)) {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}

//class Solution {
//    public boolean containsNearbyDuplicate(int[] nums, int k) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (map.containsKey(nums[i]) && (i - map.get(nums[i]) <= k)) {
//                return true;
//            }
//            map.put(nums[i], i);
//        }
//        return false;
//    }
//}