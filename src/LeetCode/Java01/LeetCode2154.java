package LeetCode.Java01;

/*
https://leetcode.com/problems/keep-multiplying-found-values-by-two/description/
 */

public class LeetCode2154 {
    public static void main(String[] args) {
        int[] nums = {5, 3, 6, 1, 12};
        System.out.println(findFinalValue(nums, 3));
    }

    public static int findFinalValue(int[] nums, int original) {
        // пока число найдено - будем искать

        while (true) {
            boolean isFound = false;
            for (int num : nums) {
                if (num == original) {
                    original = original * 2;
                    isFound = true;
                    break;
                }
            }

            if (!isFound) {
                break;
            }
        }

        return original;
    }
}

// N^2
// NlogN - вы не используете доп память
// O(n) - используем массив (доп память)
