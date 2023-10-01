package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem70 {

    // fastest and least amount of memory
    public int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int prev = 1;
        int current = 1;
        // for all other cases compute them using previous two cases
        for(int i = 1; i < n; i++) {
            int temp = current;
            current = current + prev;
            prev = temp;
        }

        return current;
    }

    // second pass, fast but expensive on memory
//    public int climbStairs(int n) {
//        int[] memo = new int[n + 2]; // increase size by two to avoid index out of bounds errors
//        memo[0] = 1; // base case of n == 1 is 1
//        memo[1] = 2; // base case of n == 2 is 2
//
//        // for all other cases compute them using previous two cases
//        for(int i = 2; i < n; i++) {
//            memo[i] = memo[i - 1] + memo[i - 2];
//        }
//
//        return memo[n - 1];
//    }

    // first pass, brute force but exceeds time limit
//    public int climbStairs(int n) {
//        if (n <= 0) {
//            return 0;
//        }
//
//        if (n == 1) {
//            return 1;
//        }
//
//        if (n == 2) {
//            return 2;
//        }
//
//        return climbStairs(n - 1) + climbStairs(n - 2);
//    }
}
