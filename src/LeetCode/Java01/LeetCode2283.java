package LeetCode.Java01;

/*
https://leetcode.com/problems/check-if-number-has-equal-digit-count-and-digit-value/
 */

public class LeetCode2283 {
    public static void main(String[] args) {

    }

    public boolean digitCount(String num) {
        int[] count = new int[10];
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            count[digit]++;
        }

        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            if (count[i] != digit) {
                return false;
            }
        }
        return true;
    }
}
