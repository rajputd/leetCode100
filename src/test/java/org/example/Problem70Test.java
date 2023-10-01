package org.example;

import org.junit.Assert;
import org.junit.Test;

public class Problem70Test {
    @Test
    public void Nis1() {
        Problem70 p = new Problem70();
        int result = p.climbStairs(1);
        // only one way, take one step
        Assert.assertEquals(1, result);
    }

    @Test
    public void Nis2() {
        Problem70 p = new Problem70();
        int result = p.climbStairs(2);
        // 1 + 1
        // 2
        Assert.assertEquals(2, result);
    }

    @Test
    public void Nis3() {
        Problem70 p = new Problem70();
        int result = p.climbStairs(3);
        // 1 + 1 + 1
        // 1 + 2
        // 2 + 1
        Assert.assertEquals(3, result);
    }

    @Test
    public void Nis4() {
        Problem70 p = new Problem70();
        int result = p.climbStairs(4);
        // 1 + 1 + 1 + 1
        // 1 + 1 + 2
        // 1 + 2 + 1
        // 2 + 1 + 1
        // 2 + 2
        Assert.assertEquals(5, result);
    }

    @Test
    public void Nis5() {
        Problem70 p = new Problem70();
        int result = p.climbStairs(5);
        // 1 + 1 + 1 + 1 + 1
        // 1 + 1 + 1 + 2
        // 1 + 1 + 2 + 1
        // 1 + 2 + 1 + 1
        // 2 + 1 + 1 + 1
        // 2 + 2 + 1
        // 2 + 1 + 2
        // 1 + 2 + 2
        Assert.assertEquals(8, result);
    }

    @Test
    public void Nis6() {
        Problem70 p = new Problem70();
        int result = p.climbStairs(6);
        // 1 + 1 + 1 + 1 + 1 + 1
        // 2 + 1 + 1 + 1 + 1
        // 1 + 2 + 1 + 1 + 1
        // 1 + 1 + 2 + 1 + 1
        // 1 + 1 + 1 + 2 + 1
        // 1 + 1 + 1 + 1 + 2
        // 2 + 2 + 1 + 1
        // 2 + 1 + 2 + 1
        // 2 + 1 + 1 + 2
        // 1 + 2 + 1 + 2
        // 1 + 1 + 2 + 2
        // 2 + 2 + 2
        Assert.assertEquals(13, result);
    }
}
