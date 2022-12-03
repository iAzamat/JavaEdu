package Seminars.Java02;

/*
https://leetcode.com/problems/binary-tree-preorder-traversal/
 */

import java.util.ArrayList;
import java.util.List;

public class Task144 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        addLeftChild(root, 1);
        addRightChild(root, 4);
        preorderTraversal(root);
        System.out.println(preorderTraversal(root));
    }

    static void addLeftChild(TreeNode parent, int val) {
        TreeNode child = new TreeNode(val);
        parent.left = child;
    }

    static void addRightChild(TreeNode parent, int val) {
        TreeNode child = new TreeNode(val);
        parent.right = child;
    }


    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        dfs(root, ans);

        return ans;
    }

    // depth first search
    // поиск в глубину
    private static void dfs(TreeNode root, List<Integer> ans) {
        if (root == null) return;
        ans.add(root.val);

        dfs(root.left, ans);
        dfs(root.right, ans);

    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}



