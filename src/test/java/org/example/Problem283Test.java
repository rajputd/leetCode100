package org.example;

import org.junit.Assert;
import org.junit.Test;

public class Problem283Test {

    @Test
    public void singleArray() {
        Problem283 p = new Problem283();
        int[] expected = {1};
        int[] input = {1};
        p.moveZeroes(input);
        arraysMatch(expected, input);
    }

    @Test
    public void singleArrayWithZeros() {
        Problem283 p = new Problem283();
        int[] expected = {0};
        int[] input = {0};
        p.moveZeroes(input);
        arraysMatch(expected, input);
    }

    @Test
    public void twoElementArray() {
        Problem283 p = new Problem283();
        int[] expected = {1,0};
        int[] input = {0,1};
        p.moveZeroes(input);
        arraysMatch(expected, input);
    }

    @Test
    public void twoElementArrayZeros() {
        Problem283 p = new Problem283();
        int[] expected = {0,0};
        int[] input = {0,0};
        p.moveZeroes(input);
        arraysMatch(expected, input);
    }

    @Test
    public void threeElementArray() {
        Problem283 p = new Problem283();
        int[] expected = {1, 0,0};
        int[] input = {0,1,0};
        p.moveZeroes(input);
        arraysMatch(expected, input);
    }

    @Test
    public void fourElementArray() {
        Problem283 p = new Problem283();
        int[] expected = {1, 5, 0, 0};
        int[] input = {0, 1, 5, 0};
        p.moveZeroes(input);
        arraysMatch(expected, input);
    }

    @Test
    public void fiveElementArray() {
        Problem283 p = new Problem283();
        int[] expected = {1, 5, 0, 0, 0};
        int[] input = {0, 1, 0, 5, 0};
        p.moveZeroes(input);
        arraysMatch(expected, input);
    }

    @Test
    public void sixElementArray() {
        Problem283 p = new Problem283();
        int[] expected = {1, 6, 5, 0, 0, 0};
        int[] input = {0, 1, 0, 6, 5, 0};
        p.moveZeroes(input);
        arraysMatch(expected, input);
    }

    @Test
    public void onlyOneAtEnd() {
        Problem283 p = new Problem283();
        int[] expected = {1, 0, 0};
        int[] input = {0, 0, 1};
        p.moveZeroes(input);
        arraysMatch(expected, input);
    }

    private void arraysMatch(int[] expected, int[] actual) {
        Assert.assertEquals(expected.length, actual.length);
        for(int i = 0; i < expected.length; i++) {
            Assert.assertEquals(expected[i], actual[i]);
        }
    }
}
