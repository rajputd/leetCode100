package org.example;

import org.junit.Assert;
import org.junit.Test;

public class Problem141Test {

    @Test
    public void testSingleNode() {
        Problem141 p = new Problem141();
        Problem141.ListNode node = new Problem141.ListNode(1);
        boolean result = p.hasCycle(node);
        Assert.assertFalse(result);
    }

    @Test
    public void testTwoNodeNoCycle() {
        Problem141 p = new Problem141();
        Problem141.ListNode node1 = new Problem141.ListNode(2);
        Problem141.ListNode node = new Problem141.ListNode(1);
        node.next = node1;
        boolean result = p.hasCycle(node);
        Assert.assertFalse(result);
    }

    @Test
    public void testTwoNodeWithCycle() {
        Problem141 p = new Problem141();
        Problem141.ListNode node1 = new Problem141.ListNode(2);
        Problem141.ListNode node = new Problem141.ListNode(1);
        node.next = node1;
        node1.next = node;
        boolean result = p.hasCycle(node);
        Assert.assertTrue(result);
    }

    @Test
    public void testThreeNodeWithCycle() {
        Problem141 p = new Problem141();
        Problem141.ListNode node2 = new Problem141.ListNode(3);
        Problem141.ListNode node1 = new Problem141.ListNode(2);
        Problem141.ListNode node = new Problem141.ListNode(1);
        node.next = node1;
        node1.next = node2;
        node2.next = node;
        boolean result = p.hasCycle(node);
        Assert.assertTrue(result);
    }

    @Test
    public void testThreeNodeWithNoCycle() {
        Problem141 p = new Problem141();
        Problem141.ListNode node2 = new Problem141.ListNode(3);
        Problem141.ListNode node1 = new Problem141.ListNode(2);
        Problem141.ListNode node = new Problem141.ListNode(1);
        node.next = node1;
        node1.next = node2;
        boolean result = p.hasCycle(node);
        Assert.assertFalse(result);
    }
}
