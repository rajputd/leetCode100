package org.example;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Problem101 {
    public static class TreeNode {
        int val;
        Problem101.TreeNode left;
        Problem101.TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, Problem101.TreeNode left, Problem101.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        return isMirror(root.left, root.right);
    }

    /**
     * checkis if n1 and n2 are mirror images (the same but flipped) of one another
     * @param n1 first tree
     * @param n2 second tree
     * @return
     */
    public boolean isMirror(TreeNode n1, TreeNode n2) {
        if (n1 == null && n2 == null) {
            return true;
        }

        if (n1 == null || n2 == null) {
            return false;
        }

        // check root node of both
        if (n1.val != n2.val) {
            return false;
        }

        // compare left node of first tree with right node of second tree
        if (!isMirror(n1.left, n2.right)) {
            return false;
        }

        // do vice versa of above statement
        if (!isMirror(n1.right, n2.left)) {
            return false;
        }

        return true;
    }

}
