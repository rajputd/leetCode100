package org.example;

import java.util.Arrays;

public class Problem108 {

    public static class TreeNode {
        int val;
        Problem108.TreeNode left;
        Problem108.TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, Problem108.TreeNode left, Problem108.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }

        int middle = nums.length / 2;
        int middleValue = nums[middle];
        int[] left = Arrays.copyOfRange(nums, 0, middle);
        int[] right = Arrays.copyOfRange(nums, middle + 1, nums.length);

        return new TreeNode(middleValue, sortedArrayToBST(left), sortedArrayToBST(right));
    }
}
