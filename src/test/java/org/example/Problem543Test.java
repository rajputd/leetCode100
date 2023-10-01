package org.example;

import org.junit.Assert;
import org.junit.Test;

public class Problem543Test {

    @Test
    public void diameterOne() {
        Problem543 p = new Problem543();
        Problem543.TreeNode node1 = new Problem543.TreeNode(2);
        Problem543.TreeNode node = new Problem543.TreeNode(1, node1, null);
        int result = p.diameterOfBinaryTree(node);
        Assert.assertEquals(1, result);
    }

    @Test
    public void diameterTwoLeftRight() {
        Problem543 p = new Problem543();
        Problem543.TreeNode node2 = new Problem543.TreeNode(3);
        Problem543.TreeNode node1 = new Problem543.TreeNode(2);
        Problem543.TreeNode node = new Problem543.TreeNode(1, node1, node2);
        int result = p.diameterOfBinaryTree(node);
        Assert.assertEquals(2, result);
    }

    @Test
    public void diameterTwoAllLeft() {
        Problem543 p = new Problem543();
        Problem543.TreeNode node2 = new Problem543.TreeNode(3);
        Problem543.TreeNode node1 = new Problem543.TreeNode(2, node2, null);
        Problem543.TreeNode node = new Problem543.TreeNode(1, node1, null);
        int result = p.diameterOfBinaryTree(node);
        Assert.assertEquals(2, result);
    }

    @Test
    public void diameterThree() {
        Problem543 p = new Problem543();
        Problem543.TreeNode node3 = new Problem543.TreeNode(4);
        Problem543.TreeNode node2 = new Problem543.TreeNode(3);
        Problem543.TreeNode node1 = new Problem543.TreeNode(2, node2, null);
        Problem543.TreeNode node = new Problem543.TreeNode(1, node1, node3);
        int result = p.diameterOfBinaryTree(node);
        Assert.assertEquals(3, result);
    }

    @Test
    public void diameterThreeAllOnRight() {
        Problem543 p = new Problem543();
        Problem543.TreeNode node3 = new Problem543.TreeNode(4);
        Problem543.TreeNode node2 = new Problem543.TreeNode(3, null, node3);
        Problem543.TreeNode node1 = new Problem543.TreeNode(2, null, node2);
        Problem543.TreeNode node = new Problem543.TreeNode(1, null, node1);
        int result = p.diameterOfBinaryTree(node);
        Assert.assertEquals(3, result);
    }

    @Test
    public void longestPathNotInRoot() {
        Problem543 p = new Problem543();

        // fourth level
        Problem543.TreeNode node5 = new Problem543.TreeNode(6);
        Problem543.TreeNode node4 = new Problem543.TreeNode(5);

        // third level
        Problem543.TreeNode node3 = new Problem543.TreeNode(4, node5, null);
        Problem543.TreeNode node2 = new Problem543.TreeNode(3, node4, null);

        //second level
        Problem543.TreeNode node1 = new Problem543.TreeNode(2, node2, node3);

        // top level
        Problem543.TreeNode node = new Problem543.TreeNode(1, null, node1);
        int result = p.diameterOfBinaryTree(node);
        Assert.assertEquals(4, result);
    }


    
}
