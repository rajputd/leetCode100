package org.example;

import org.junit.Assert;
import org.junit.Test;

public class Problem226Test {
    @Test
    public void invertEmpty() {
        Problem226 p = new Problem226();
        Problem226.TreeNode result = p.invertTree(null);
        Assert.assertNull(result);
    }

    @Test
    public void invertOne() {
        Problem226 p = new Problem226();
        Problem226.TreeNode node = new Problem226.TreeNode(2);
        Problem226.TreeNode result = p.invertTree(node);
        Assert.assertEquals(2, result.val);
    }

    @Test
    public void invertTwo() {
        Problem226 p = new Problem226();
        Problem226.TreeNode node1 = new Problem226.TreeNode(2);
        Problem226.TreeNode node = new Problem226.TreeNode(1, node1, null);
        Problem226.TreeNode result = p.invertTree(node);
        Assert.assertEquals(1, result.val);
        Assert.assertNull(result.left);
        Assert.assertEquals(2, result.right.val);
    }

    @Test
    public void invertThree() {
        Problem226 p = new Problem226();
        Problem226.TreeNode node2 = new Problem226.TreeNode(3);
        Problem226.TreeNode node1 = new Problem226.TreeNode(2);
        Problem226.TreeNode node = new Problem226.TreeNode(1, node1, node2);
        Problem226.TreeNode result = p.invertTree(node);
        Assert.assertEquals(1, result.val);
        Assert.assertEquals(3, result.left.val);
        Assert.assertEquals(2, result.right.val);
    }

    @Test
    public void invertNested() {
        Problem226 p = new Problem226();
        Problem226.TreeNode node2 = new Problem226.TreeNode(3);
        Problem226.TreeNode node1 = new Problem226.TreeNode(2, node2, null);
        Problem226.TreeNode node = new Problem226.TreeNode(1, node1, null);
        Problem226.TreeNode result = p.invertTree(node);
        Assert.assertEquals(1, result.val);
        Assert.assertEquals(2, result.right.val);
        Assert.assertEquals(3, result.right.right.val);
    }
}
