package org.example;

public class Problem226 {

    public static class TreeNode {
        int val;
        Problem226.TreeNode left;
        Problem226.TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, Problem226.TreeNode left, Problem226.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // in place
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);

        return root;
    }

    // immutable
//    public TreeNode invertTree(TreeNode root) {
//        if (root == null) {
//            return null;
//        }
//
//        return new TreeNode(root.val, invertTree(root.right), invertTree(root.left));
//    }
}
