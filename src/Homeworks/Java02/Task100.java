package Homeworks.Java02;

/*
https://leetcode.com/problems/same-tree/
 */

public class Task100 {
    public static void main(String[] args) {
        // Example 1
        TreeNode p1 = new TreeNode(1);
        addLeftChild(p1, 2);
        addRightChild(p1, 3);

        TreeNode q1 = new TreeNode(1);
        addLeftChild(q1, 2);
        addRightChild(q1, 3);

        System.out.println("Example 1: " + isSameTree(p1, q1));

        // Example 2
        TreeNode p2 = new TreeNode(1);
        addLeftChild(p2, 2);

        TreeNode q2 = new TreeNode(1);
        addRightChild(q2, 2);

        System.out.println("Example 2: " + isSameTree(p2, q2));

        // Example 3

        TreeNode p3 = new TreeNode(1);
        addLeftChild(p3, 2);
        addRightChild(p3, 1);

        TreeNode q3 = new TreeNode(1);
        addLeftChild(q3, 1);
        addRightChild(q3, 2);

        System.out.println("Example 3: " + isSameTree(p3, q3));


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

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
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
