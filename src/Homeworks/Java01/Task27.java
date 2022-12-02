package Homeworks.Java01;

import java.util.Arrays;

/*
https://leetcode.com/problems/remove-element/
 */

public class Task27 {
    public static void main(String[] args) throws Exception {
        int[] nums1 = new int[]{3, 2, 2, 3};
        int val1 = 3;
        removeElement(nums1, val1);
        System.out.println(Arrays.toString(nums1));
    }

    public static int removeElement(int[] nums, int val) {
        int write = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[write++] = nums[i];
            }
        }
        return write;
    }
}
