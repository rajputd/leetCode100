package org.example;

public class Problem543 {
    public static class TreeNode {
        int val;
        Problem543.TreeNode left;
        Problem543.TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, Problem543.TreeNode left, Problem543.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // third pass (fast but left memory intensive)
    int maxDiameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        diameterHelper(root);
        return maxDiameter;
    }

    // returns max depth of current
    private int diameterHelper(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = diameterHelper(root.left);
        int rightDepth = diameterHelper(root.right);

        // update global maxDiameter tracker
        maxDiameter = Math.max(maxDiameter, leftDepth + rightDepth);
        return Math.max(leftDepth, rightDepth) + 1;
    }

    // second pass (fast but memory intensive)
//    public int diameterOfBinaryTree(TreeNode root) {
//        int[] result = diameterHelper(root);
//        return result[0];
//    }
//
//    private int[] diameterHelper(TreeNode root) {
//        //first val is current max diameter
//        //second is max depth
//        int[] result = {0, 0};
//
//        // if at a null node then no height or diameter
//        if (root == null) {
//            return result;
//        }
//
//        // if at a real node then get the depth and max diameter of left and right
//        int[] left = diameterHelper(root.left);
//        int[] right = diameterHelper(root.right);
//
//        // figure out if left or right has the larger diameter
//        int maxDiameter = Math.max(left[0], right[0]);
//        // figure out whether left or right is deeper
//        int currentMaxDepth = Math.max(left[1], right[1]);
//        // calculate diameter if it had to pass through current root
//        int diameterWithCurrentRoot = left[1] + right[1];
//
//        // update max diameter with larger of diamaeter of children or current root
//        result[0] = Math.max(maxDiameter, diameterWithCurrentRoot);
//        // update max depth for parent calculation
//        result[1] = currentMaxDepth + 1;
//        return result;
//    }

    // first attempt (slow and memory intensive)
//    public int diameterOfBinaryTree(TreeNode root) {
//        if (root == null) {
//            return 0;
//        }
//
//        int maxDiameterOfChildren = Math.max(diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right));
//        int diameterWithCurrentRoot = getDepth(root.left) + getDepth(root.right);
//        return Math.max(diameterWithCurrentRoot, maxDiameterOfChildren);
//    }
//
//    private int getDepth(TreeNode root) {
//        if (root == null) {
//            return 0;
//        }
//
//        return Math.max(getDepth(root.left), getDepth(root.right)) + 1;
//    }
}
