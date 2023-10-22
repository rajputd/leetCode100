package org.example;

import org.junit.Assert;
import org.junit.Test;

public class Problem121Test {
    @Test
    public void noProfitWithTwo() {
        Problem121 p = new Problem121();
        int[] prices = {3, 1};
        int result = p.maxProfit(prices);
        Assert.assertEquals(0, result);
    }

    @Test
    public void noProfit() {
        Problem121 p = new Problem121();
        int[] prices = {7, 6, 5, 4, 3, 2, 1};
        int result = p.maxProfit(prices);
        Assert.assertEquals(0, result);
    }

    @Test
    public void startEnd() {
        Problem121 p = new Problem121();
        int[] prices = {1, 2, 3, 4, 5, 6, 7};
        int result = p.maxProfit(prices);
        Assert.assertEquals(6, result);
    }

    @Test
    public void startEndWithtwo() {
        Problem121 p = new Problem121();
        int[] prices = {1, 2};
        int result = p.maxProfit(prices);
        Assert.assertEquals(1, result);
    }

    @Test
    public void middle() {
        Problem121 p = new Problem121();
        int[] prices = {2, 1, 3, 4, 5, 7, 6};
        int result = p.maxProfit(prices);
        Assert.assertEquals(6, result);
    }

    @Test
    public void nonGreedy() {
        Problem121 p = new Problem121();
        int[] prices = {2, 5, 1, 2};
        int result = p.maxProfit(prices);
        Assert.assertEquals(3, result);
    }
}
