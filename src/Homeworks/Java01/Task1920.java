package Homeworks.Java01;

import java.util.Arrays;

/*
https://leetcode.com/problems/build-array-from-permutation/
 */
public class Task1920 {
    public static void main(String[] args) throws Exception {
        int[] nums = new int[]{0, 2, 1, 5, 3, 4};
        System.out.println(Arrays.toString(buildArray(nums)));

    }

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}





