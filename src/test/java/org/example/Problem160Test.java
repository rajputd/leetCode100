package org.example;

import org.junit.Assert;
import org.junit.Test;

public class Problem160Test {

    @Test
    public void noIntersection() {
        Problem160.ListNode a = new Problem160.ListNode(1);
        Problem160.ListNode b = new Problem160.ListNode(1);
        Problem160 p = new Problem160();
        Problem160.ListNode result = p.getIntersectionNode(a, b);
        Assert.assertNull(result);
    }

    @Test
    public void oneIntersection() {
        Problem160.ListNode a = new Problem160.ListNode(1);
        Problem160.ListNode b = new Problem160.ListNode(1);
        Problem160.ListNode intersection = new Problem160.ListNode(1);
        a.next = intersection;
        b.next = intersection;

        Problem160 p = new Problem160();
        Problem160.ListNode result = p.getIntersectionNode(a, b);
        Assert.assertEquals(intersection, result);
    }

    @Test
    public void interleavedIntersection() {
        Problem160.ListNode a = new Problem160.ListNode(1);
        Problem160.ListNode a1 = new Problem160.ListNode(2);
        Problem160.ListNode b = new Problem160.ListNode(1);
        Problem160.ListNode intersection = new Problem160.ListNode(1);
        a.next = a1;
        a1.next = intersection;
        b.next = intersection;

        Problem160 p = new Problem160();
        Problem160.ListNode result = p.getIntersectionNode(a, b);
        Assert.assertEquals(intersection, result);
    }

    @Test
    public void LongerListBeforeIntersection() {
        Problem160.ListNode a = new Problem160.ListNode(1);
        Problem160.ListNode a1 = new Problem160.ListNode(2);
        Problem160.ListNode b = new Problem160.ListNode(1);
        Problem160.ListNode b1 = new Problem160.ListNode(1);
        Problem160.ListNode intersection = new Problem160.ListNode(1);
        a.next = a1;
        b.next = b1;
        a1.next = intersection;
        b1.next = intersection;
        Problem160 p = new Problem160();
        Problem160.ListNode result = p.getIntersectionNode(a, b);
        Assert.assertEquals(intersection, result);
    }
}
