package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem118Test {

    @Test
    public void singleRowTest() {
        Problem118 p = new Problem118();
        List<List<Integer>> result = p.generate(1);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1));
        checkRows(expected, result);
    }

    @Test
    public void twoRowTest() {
        Problem118 p = new Problem118();
        List<List<Integer>> result = p.generate(2);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1));
        expected.add(Arrays.asList(1,1));
        checkRows(expected, result);
    }

    @Test
    public void threeRowTest() {
        Problem118 p = new Problem118();
        List<List<Integer>> result = p.generate(3);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1));
        expected.add(Arrays.asList(1,1));
        expected.add(Arrays.asList(1,2,1));
        checkRows(expected, result);
    }

    @Test
    public void fourRowTest() {
        Problem118 p = new Problem118();
        List<List<Integer>> result = p.generate(4);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1));
        expected.add(Arrays.asList(1,1));
        expected.add(Arrays.asList(1,2,1));
        expected.add(Arrays.asList(1,3,3,1));
        checkRows(expected, result);
    }

    @Test
    public void fiveRowTest() {
        Problem118 p = new Problem118();
        List<List<Integer>> result = p.generate(5);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1));
        expected.add(Arrays.asList(1,1));
        expected.add(Arrays.asList(1,2,1));
        expected.add(Arrays.asList(1,3,3,1));
        expected.add(Arrays.asList(1,4,6,4,1));
        checkRows(expected, result);
    }

    void checkRows(List<List<Integer>> expected, List<List<Integer>> actual) {
        Assert.assertEquals(expected.size(), actual.size());
        for(int i = 0; i < expected.size(); i++) {
            List<Integer> expectedRow = expected.get(i);
            List<Integer> actualRow = actual.get(i);
            Assert.assertEquals(expectedRow.size(), actualRow.size());
            Assert.assertArrayEquals(expectedRow.toArray(), actualRow.toArray());
        }
    }
}
