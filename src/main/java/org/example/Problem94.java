package org.example;

import java.util.ArrayList;
import java.util.List;

public class Problem94 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        // build a result to return
        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        // if have left node get travese left node
        if (root.left != null) {
            result.addAll(inorderTraversal(root.left));
        }

        // add in current node value
        result.add(root.val);

        // if have right node, traverse right node
        if (root.right != null) {
            result.addAll(inorderTraversal(root.right));
        }

        return result;
    }
}
