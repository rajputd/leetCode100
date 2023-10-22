package org.example;

public class Problem121 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        return maxProfit;
    }

    // first pass, too slow
//    public int maxProfit(int[] prices) {
//        int maxProfit = 0;
//        for(int i = 0; i < prices.length; i++) {
//            for(int j = i + 1; j < prices.length; j++) {
//                int profit = prices[j] - prices[i];
//                maxProfit = Math.max(maxProfit, profit);
//            }
//        }
//        return maxProfit;
//    }
}
