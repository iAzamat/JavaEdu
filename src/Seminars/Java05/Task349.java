package Seminars.Java05;

/*
https://leetcode.com/problems/intersection-of-two-arrays/
 */

import java.util.*;

public class Task349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersection(nums2, nums1);
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        List<Integer> intersect = new ArrayList<>();
        for (int num : nums2) {
            if (set.contains(num)) {
                intersect.add(num);
                set.remove(num);
            }
        }
        int[] outarr = new int[intersect.size()];
        for (int i = 0; i < outarr.length; i++) {
            outarr[i] = intersect.get(i);
        }
        return outarr;
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2, 2};
        System.out.println("Example 1: " + Arrays.toString(intersection(nums1, nums2)));

        // Example 2
        int[] nums3 = new int[]{4, 9, 5};
        int[] nums4 = new int[]{9, 4, 9, 8, 4};
        System.out.println("Example 2: " + Arrays.toString(intersection(nums3, nums4)));
    }
}
