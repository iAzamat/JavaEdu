package Seminars.Java03;

/*
https://leetcode.com/problems/combinations/
 */

import java.util.ArrayList;
import java.util.List;

public class Task77 {
    public static void main(String[] args) {

    }

}

class Solution {
    List<List<Integer>> ans; // переменная класса

    public List<List<Integer>> combine(int n, int k) {
        ans = new ArrayList<>();
        helper(0, new ArrayList<>(), n, k);
        return ans;
    }

    private void helper(int prev, List<Integer> comb, int n, int k) {
        if (comb.size() == k) {
            ans.add(new ArrayList<>(comb));
            return;
        }

        for (int i = prev + 1; i <= n; i++) {
            comb.add(i);
            helper(i, comb, n, k);
            comb.remove(comb.size() - 1);
        }
    }
}
