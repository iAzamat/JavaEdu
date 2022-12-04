package Seminars.Java05;

/*
https://leetcode.com/problems/two-sum/
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int val = target - nums[i];
            if (map.containsKey(val)) {
                return new int[]{map.get(val), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = new int[]{2, 7, 11, 15};
        int target1 = 9;
        System.out.println("Example 1: " + Arrays.toString(twoSum(nums1, target1)));

        // Example 2
        int[] nums2 = new int[]{3, 2, 4};
        int target2 = 6;
        System.out.println("Example 2: " + Arrays.toString(twoSum(nums2, target2)));

        // Example 3
        int[] nums3 = new int[]{3, 3};
        int target3 = 6;
        System.out.println("Example 3: " + Arrays.toString(twoSum(nums3, target3)));
    }
}