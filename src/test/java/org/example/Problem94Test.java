package org.example;

import org.example.Problem94.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class Problem94Test {
    @Test
    public void traverseOneElement() {
        Problem94 p = new Problem94();
        TreeNode node = new TreeNode(1);
        List<Integer> result = p.inorderTraversal(node);
        Assert.assertEquals(1, result.size());
        Assert.assertEquals(1, result.get(0).intValue());
    }

    @Test
    public void allOnLeft() {
        Problem94 p = new Problem94();
        TreeNode node = new TreeNode(0);
        TreeNode node1 = new TreeNode(1, node, null);
        TreeNode node2 = new TreeNode(2, node1, null);
        List<Integer> result = p.inorderTraversal(node2);
        Assert.assertEquals(3, result.size());
        for(int i = 0; i < 3; i++) {
            Assert.assertEquals(i, result.get(i).intValue());
        }
    }
    @Test
    public void allDirections() {
        Problem94 p = new Problem94();
        TreeNode node = new TreeNode(2);
        TreeNode node1 = new TreeNode(0);
        TreeNode node2 = new TreeNode(1, node1, node);
        List<Integer> result = p.inorderTraversal(node2);
        Assert.assertEquals(3, result.size());
        for(int i = 0; i < 3; i++) {
            Assert.assertEquals(i, result.get(i).intValue());
        }
    }

    @Test
    public void allRight() {
        Problem94 p = new Problem94();
        TreeNode node = new TreeNode(2);
        TreeNode node1 = new TreeNode(1, null, node);
        TreeNode node2 = new TreeNode(0, null, node1);
        List<Integer> result = p.inorderTraversal(node2);
        Assert.assertEquals(3, result.size());
        for(int i = 0; i < 3; i++) {
            Assert.assertEquals(i, result.get(i).intValue());
        }
    }
}
