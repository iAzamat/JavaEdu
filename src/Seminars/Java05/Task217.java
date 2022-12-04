package Seminars.Java05;

import java.util.HashSet;
import java.util.Set;

public class Task217 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 1};
        int[] nums2 = new int[]{1, 2, 3, 4};
        int[] nums3 = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println("Example 1: " + containsDuplicate(nums1));
        System.out.println("Example 2: " + containsDuplicate(nums2));
        System.out.println("Example 3: " + containsDuplicate(nums3));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
