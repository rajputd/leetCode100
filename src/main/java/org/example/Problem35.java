package org.example;

/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 */
public class Problem35 {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length;

        while (start < end) {
            int mid = ((end - start) / 2) + start;

            System.out.println("start = " + start);
            System.out.println("mid = " + mid);
            System.out.println("end = " + end);
            System.out.println("---------");

            if (nums[mid] == target) {
                System.out.println("SUCCESS MID == " + mid);
                return mid;
            }

            if (nums[mid] < target) {
                start = mid + 1;
            }

            if (nums[mid] > target) {
                end = mid;
            }
        }

        System.out.println("FAIL");
        System.out.println("start = " + start);
        System.out.println("end = " + end);

        return start;
    }
}
