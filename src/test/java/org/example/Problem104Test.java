package org.example;

import org.junit.Assert;
import org.junit.Test;

public class Problem104Test {
    @Test
    public void oneElement() {
        Problem104 p = new Problem104();
        Problem104.TreeNode node = new Problem104.TreeNode(1);
        int result = p.maxDepth(node);
        Assert.assertEquals(1, result);
    }

    @Test
    public void twoElement() {
        Problem104 p = new Problem104();
        Problem104.TreeNode node = new Problem104.TreeNode(2);
        Problem104.TreeNode node1 = new Problem104.TreeNode(2);
        Problem104.TreeNode node2 = new Problem104.TreeNode(1, node1, node);
        int result = p.maxDepth(node2);
        Assert.assertEquals(2, result);
    }

    @Test
    public void threeElement() {
        Problem104 p = new Problem104();
        Problem104.TreeNode node = new Problem104.TreeNode(2);
        Problem104.TreeNode node1 = new Problem104.TreeNode(2);
        Problem104.TreeNode node2 = new Problem104.TreeNode(1, node1, node);
        Problem104.TreeNode node3 = new Problem104.TreeNode(0, node2, null);
        int result = p.maxDepth(node3);
        Assert.assertEquals(3, result);
    }
}
