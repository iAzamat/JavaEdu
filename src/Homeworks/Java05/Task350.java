package Homeworks.Java05;

/*
https://leetcode.com/problems/intersection-of-two-arrays-ii/
 */

import java.util.*;

public class Task350 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2, 2};
        System.out.println("Example 1: " + Arrays.toString(intersect(nums1, nums2)));

        int[] nums12 = new int[]{4, 9, 5};
        int[] nums22 = new int[]{9, 4, 9, 8, 4};
        System.out.println("Example 2: " + Arrays.toString(intersect(nums12, nums22)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        List<Integer> inter = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums1) {
            map.putIfAbsent(num, 0);
            map.put(num, map.get(num) + 1);
        }

        for (int num : nums2) {
            if (map.containsKey(num)) {
                inter.add(num);
                map.put(num, map.get(num) - 1);
                if (map.get(num) == 0) {
                    map.remove(num);
                }
            }
        }

        int[] ans = new int[inter.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = inter.get(i);
        }
        return ans;
    }
}

//class Solution {
//    public int[] intersect(int[] nums1, int[] nums2) {
//        if (nums1.length > nums2.length) {
//            int[] temp = nums1;
//            nums1 = nums2;
//            nums2 = temp;
//        }
//        List<Integer> inter = new ArrayList<>();
//        Map<Integer, Integer> map = new HashMap<>();
//
//        for (int num : nums1) {
//            map.putIfAbsent(num, 0);
//            map.put(num, map.get(num) + 1);
//        }
//
//        for (int num : nums2) {
//            if (map.containsKey(num)) {
//                inter.add(num);
//                map.put(num, map.get(num) - 1);
//                if (map.get(num) == 0) {
//                    map.remove(num);
//                }
//            }
//        }
//
//        int[] ans = new int[inter.size()];
//        for (int i = 0; i < ans.length; i++) {
//            ans[i] = inter.get(i);
//        }
//        return ans;
//    }
//}