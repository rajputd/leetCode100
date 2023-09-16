package org.example;

import org.junit.Assert;
import org.junit.Test;

public class Problem35Test {

    @Test
    public void searchInsertSingleElement() {
        Problem35 p = new Problem35();
        int[] arr = {1};
        int i = p.searchInsert(arr, 1);
        Assert.assertEquals(0, i);
    }

    @Test
    public void searchInsertFirstElement() {
        Problem35 p = new Problem35();
        int[] arr = {1, 2, 3, 4, 5};
        int i = p.searchInsert(arr, 1);
        Assert.assertEquals(0, i);
    }

    @Test
    public void searchInsertMiddleElement() {
        Problem35 p = new Problem35();
        int[] arr = {1, 2, 3, 4, 5};
        int i = p.searchInsert(arr, 3);
        Assert.assertEquals(2, i);
    }

    @Test
    public void searchInsertLastElement() {
        Problem35 p = new Problem35();
        int[] arr = {1, 2, 3, 4, 5};
        int i = p.searchInsert(arr, 5);
        Assert.assertEquals(4, i);
    }

    @Test
    public void searchInsertNotThereTooHigh() {
        Problem35 p = new Problem35();
        int[] arr = {1, 2, 3, 4, 5};
        int i = p.searchInsert(arr, 7);
        Assert.assertEquals(5, i);
    }

    @Test
    public void searchInsertNotThereTooLow() {
        Problem35 p = new Problem35();
        int[] arr = {1, 2, 3, 4, 5};
        int i = p.searchInsert(arr, 0);
        Assert.assertEquals(0, i);
    }

    @Test
    public void searchInsertNotThereMiddleIsh() {
        Problem35 p = new Problem35();
        int[] arr = {1, 2, 3, 4, 6};
        int i = p.searchInsert(arr, 5);
        Assert.assertEquals(4, i);
    }
}
