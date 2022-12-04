package Homeworks.Java02;

/*
https://leetcode.com/problems/binary-tree-paths/
 */

import java.util.ArrayList;
import java.util.List;

public class Task257 {
    static List<String> ans = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        addRightChild(root, 3);

        TreeNode left = addLeftChild(root, 2);
        addRightChild(left, 5);

        System.out.println(binaryTreePaths(root));
    }

    static TreeNode addLeftChild(TreeNode parent, int val) {
        TreeNode child = new TreeNode(val);
        parent.left = child;
        return child;
    }

    static TreeNode addRightChild(TreeNode parent, int val) {
        TreeNode child = new TreeNode(val);
        parent.right = child;
        return child;
    }

    public static List<String> binaryTreePaths(TreeNode root) {
        dfs(root, "");
        return ans;
    }


    private static void dfs(TreeNode root, String path) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            ans.add(path + root.val);
            return;
        }

        dfs(root.left, path + root.val + "->");
        dfs(root.right, path + root.val + "->");

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



