package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Problem206Test {

    @Test
    public void emptyList() {
        Problem206.ListNode input = null;
        Problem206 p = new Problem206();
        Problem206.ListNode result = p.reverseList(input);
        Assert.assertNull(result);
    }

    @Test
    public void singleList() {
        Problem206.ListNode input = buildList(Arrays.asList(1));
        Problem206 p = new Problem206();
        Problem206.ListNode result = p.reverseList(input);
        Assert.assertEquals(1, result.val);
    }

    @Test
    public void twoItemList() {
        Problem206.ListNode input = buildList(Arrays.asList(1, 2));
        Problem206 p = new Problem206();
        Problem206.ListNode result = p.reverseList(input);
        Assert.assertEquals(2, result.val);
        Assert.assertEquals(1, result.next.val);
    }

    @Test
    public void threeItemList() {
        Problem206.ListNode input = buildList(Arrays.asList(1, 2, 3));
        Problem206 p = new Problem206();
        Problem206.ListNode result = p.reverseList(input);
        Assert.assertEquals(3, result.val);
        Assert.assertEquals(2, result.next.val);
        Assert.assertEquals(1, result.next.next.val);
    }

    private Problem206.ListNode buildList(List<Integer> l) {
        Problem206.ListNode output = new Problem206.ListNode(l.get(0));
        Problem206.ListNode current = output;
        for(int i = 1; i < l.size(); i++) {
            Problem206.ListNode newNode = new Problem206.ListNode(l.get(i));
            current.next = newNode;
            current = newNode;
        }
        return output;
    }
}
