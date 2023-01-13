package LeetCode.Java01;

/*
https://leetcode.com/problems/maximum-units-on-a-truck/
 */

import java.util.Arrays;
import java.util.Comparator;


public class LeetCode1710 {
    public static void main(String[] args) {

    }

    public int maximumUnits(int[][] boxTypes, int truckSize) {

        Arrays.sort(boxTypes, (o1, o2) -> Integer.compare(o2[1], o1[1]));

        int ans = 0;
        for (var bucket : boxTypes) {
            int boxCount = bucket[0];
            int unitCount = bucket[1];

            if (truckSize - boxCount >= 0) {
                truckSize -= boxCount;
                ans += boxCount * unitCount;
            } else {
                ans += unitCount * truckSize;
                break;
            }
        }
        return ans;
    }


}
