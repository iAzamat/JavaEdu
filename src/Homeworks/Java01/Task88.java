package Homeworks.Java01;

/*
https://leetcode.com/problems/merge-sorted-array/
*/

import java.util.Arrays;

public class Task88 {
    public static void main(String[] args) throws Exception {
        int[] nums1 = new int[]{4, 5, 6, 0, 0, 0};
        int m = 3;
        int[] nums2 = new int[]{1, 2, 3};
        int n = 3;
        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        m--;
        n--;
        int k = nums1.length - 1;
        while (m >= 0 && n >= 0) {
            if (nums1[m] > nums2[n]) {
                nums1[k] = nums1[m];
                m--;
            } else {
                nums1[k] = nums2[n];
                n--;
            }
            k--;
        }
        while (m >= 0) {
            nums1[k] = nums1[m];
            k--;
            m--;
        }
        while (n >= 0) {
            nums1[k] = nums2[n];
            k--;
            n--;
        }
        System.out.println(Arrays.toString(nums1));
    }
}


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m--;
        n--;
        int k = nums1.length - 1;
        while (m >= 0 && n >= 0) {
            if (nums1[m] > nums2[n]) {
                nums1[k] = nums1[m];
                m--;
            } else {
                nums1[k] = nums2[n];
                n--;
            }
            k--;
        }
        while (m >= 0) {
            nums1[k] = nums1[m];
            k--;
            m--;
        }
        while (n >= 0) {
            nums1[k] = nums2[n];
            k--;
            n--;
        }
        System.out.println(Arrays.toString(nums1));
    }
}
