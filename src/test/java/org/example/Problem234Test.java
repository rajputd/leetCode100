package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Problem234Test {

    @Test
    public void singleList() {
        Problem234.ListNode input = buildList(Arrays.asList(1));
        Problem234 p = new Problem234();
        boolean result = p.isPalindrome(input);
        Assert.assertTrue(result);
    }

    @Test
    public void twoElementDrome() {
        Problem234.ListNode input = buildList(Arrays.asList(1, 1));
        Problem234 p = new Problem234();
        boolean result = p.isPalindrome(input);
        Assert.assertTrue(result);
    }

    @Test
    public void twoElementNoDrome() {
        Problem234.ListNode input = buildList(Arrays.asList(1, 2));
        Problem234 p = new Problem234();
        boolean result = p.isPalindrome(input);
        Assert.assertFalse(result);
    }

    @Test
    public void threeElementDrome() {
        Problem234.ListNode input = buildList(Arrays.asList(1, 2, 1));
        Problem234 p = new Problem234();
        boolean result = p.isPalindrome(input);
        Assert.assertTrue(result);
    }

    @Test
    public void threeElementNoDrome() {
        Problem234.ListNode input = buildList(Arrays.asList(1, 2, 2));
        Problem234 p = new Problem234();
        boolean result = p.isPalindrome(input);
        Assert.assertFalse(result);
    }

    @Test
    public void fourElementDrome() {
        Problem234.ListNode input = buildList(Arrays.asList(1, 2, 2, 1));
        Problem234 p = new Problem234();
        boolean result = p.isPalindrome(input);
        Assert.assertTrue(result);
    }

    @Test
    public void fourElementNoDrome() {
        Problem234.ListNode input = buildList(Arrays.asList(1, 3, 2, 1));
        Problem234 p = new Problem234();
        boolean result = p.isPalindrome(input);
        Assert.assertFalse(result);
    }

    private Problem234.ListNode buildList(List<Integer> l) {
        Problem234.ListNode output = new Problem234.ListNode(l.get(0));
        Problem234.ListNode current = output;
        for(int i = 1; i < l.size(); i++) {
            Problem234.ListNode newNode = new Problem234.ListNode(l.get(i));
            current.next = newNode;
            current = newNode;
        }
        return output;
    }
}
