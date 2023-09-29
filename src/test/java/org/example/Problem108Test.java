package org.example;

import org.junit.Assert;
import org.junit.Test;

public class Problem108Test {

    @Test
    public void basicTest() {
        Problem108 p = new Problem108();
        int[] input = {-10, -3, 0, 5, 9};
        Problem108.TreeNode result = p.sortedArrayToBST(input);
        Assert.assertEquals(0, result.val);
        Assert.assertEquals(-3, result.left.val);
        Assert.assertEquals(-10, result.left.left.val);
        Assert.assertNull(result.left.right);
        Assert.assertEquals( 9, result.right.val);
        Assert.assertEquals(5, result.right.left.val);
        Assert.assertNull(result.right.right);
    }

    @Test
    public void oneElement() {
        Problem108 p = new Problem108();
        int[] input = {0};
        Problem108.TreeNode result = p.sortedArrayToBST(input);
        Assert.assertEquals(result.val, 0);
        Assert.assertNull(result.left);
        Assert.assertNull(result.right);
    }

    @Test
    public void noElement() {
        Problem108 p = new Problem108();
        int[] input = {};
        Problem108.TreeNode result = p.sortedArrayToBST(input);
        Assert.assertNull(result);
    }

    @Test
    public void twoElement() {
        Problem108 p = new Problem108();
        int[] input = {0, 1};
        Problem108.TreeNode result = p.sortedArrayToBST(input);
        Assert.assertEquals(result.val, 1);
        Assert.assertEquals(result.left.val, 0);
    }
    
    
}
