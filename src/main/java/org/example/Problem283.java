package org.example;

import java.util.Arrays;

public class Problem283 {

    // first attempt
//    public void moveZeroes(int[] nums) {
//        boolean movedZeros = true;
//        int temp;
//        while(movedZeros) {
//            movedZeros = false;
//            for(int i = 0; i < nums.length - 1; i++) {
//                if (nums[i] == 0 && nums[i + 1] != 0) {
//                    temp = nums[i + 1];
//                    nums[i + 1] = nums[i];
//                    nums[i] = temp;
//                    movedZeros = true;
//                }
//            }
//        }
//    }

    // two pointer solution
    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;
        for(int i = 0; i < nums.length; i ++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }

        for(int i = nonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
