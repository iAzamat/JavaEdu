package Seminars.Java02;

/*
https://leetcode.com/problems/binary-tree-preorder-traversal/
 */

public class Task144 {

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */

//    class Solution {
//        public List<Integer> preorderTraversal(TreeNode root) {
//            List<Integer> ans = new ArrayList<>();
//            dfs(root, ans);
//
//            return ans;
//        }
//
//        // depth first search
//        // поиск в глубину
//        private void dfs(TreeNode root, List<Integer> ans) {
//            if (root == null) return;
//            ans.add(root.val);
//
//            dfs(root.left, ans);
//            dfs(root.right, ans);
//
//        }
//    }
}



