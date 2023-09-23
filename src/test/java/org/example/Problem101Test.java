package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class Problem101Test {
    @Test
    public void oneElement() {
        Problem101 p = new Problem101();
        Problem101.TreeNode node = new Problem101.TreeNode(1);
        boolean result = p.isSymmetric(node);
        Assert.assertTrue(result);
    }

    @Test
    public void twoElementFail() {
        Problem101 p = new Problem101();
        Problem101.TreeNode node = new Problem101.TreeNode(1);
        Problem101.TreeNode node1 = new Problem101.TreeNode(2, node, null);
        boolean result = p.isSymmetric(node1);
        Assert.assertFalse(result);
    }

    @Test
    public void threeElementPass() {
        Problem101 p = new Problem101();
        Problem101.TreeNode node = new Problem101.TreeNode(2);
        Problem101.TreeNode node1 = new Problem101.TreeNode(2);
        Problem101.TreeNode node2 = new Problem101.TreeNode(1, node1, node);
        boolean result = p.isSymmetric(node2);
        Assert.assertTrue(result);
    }

    @Test
    public void threeElementFail() {
        Problem101 p = new Problem101();
        Problem101.TreeNode node = new Problem101.TreeNode(1);
        Problem101.TreeNode node1 = new Problem101.TreeNode(2);
        Problem101.TreeNode node2 = new Problem101.TreeNode(1, node1, node);
        boolean result = p.isSymmetric(node2);
        Assert.assertFalse(result);
    }

    @Test
    public void threeLayerPass() {
        Problem101 p = new Problem101();
        Problem101.TreeNode leaf1 = new Problem101.TreeNode(3);
        Problem101.TreeNode leaf2 = new Problem101.TreeNode(4);
        Problem101.TreeNode leaf3 = new Problem101.TreeNode(4);
        Problem101.TreeNode leaf4 = new Problem101.TreeNode(3);

        Problem101.TreeNode middle1 = new Problem101.TreeNode(2, leaf1, leaf2);
        Problem101.TreeNode middle2 = new Problem101.TreeNode(2, leaf3, leaf4);

        Problem101.TreeNode parent = new Problem101.TreeNode(1, middle1, middle2);

        boolean result = p.isSymmetric(parent);
        Assert.assertTrue(result);
    }

    @Test
    public void threeLayerFail() {
        Problem101 p = new Problem101();
        Problem101.TreeNode leaf1 = new Problem101.TreeNode(3);
        Problem101.TreeNode leaf2 = new Problem101.TreeNode(3);

        Problem101.TreeNode middle1 = new Problem101.TreeNode(2, null, leaf1);
        Problem101.TreeNode middle2 = new Problem101.TreeNode(2, null, leaf2);

        Problem101.TreeNode parent = new Problem101.TreeNode(1, middle1, middle2);

        boolean result = p.isSymmetric(parent);
        Assert.assertFalse(result);
    }

    @Test
    public void threeLayerFailEdgeCase() {
        Problem101 p = new Problem101();
        Problem101.TreeNode leaf1 = new Problem101.TreeNode(2);
        Problem101.TreeNode leaf2 = new Problem101.TreeNode(2);

        Problem101.TreeNode middle1 = new Problem101.TreeNode(2, leaf1, null);
        Problem101.TreeNode middle2 = new Problem101.TreeNode(2, leaf2, null);

        Problem101.TreeNode parent = new Problem101.TreeNode(1, middle1, middle2);

        boolean result = p.isSymmetric(parent);
        Assert.assertFalse(result);
    }
}
