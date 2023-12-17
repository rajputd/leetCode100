package org.example;

import java.util.List;
import java.util.Stack;

public class Problem234 {
    public static class ListNode {
        int val;
        Problem234.ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, Problem234.ListNode next) { this.val = val; this.next = next; }
    }

//    public boolean isPalindrome(ListNode head) {
//        ListNode reversed = reverseList(head);
//        ListNode p1 = head;
//        ListNode p2 = reversed;
//        while(p1 != null && p2 != null) {
//            if (p1.val != p2.val) {
//                return false;
//            }
//            p1 = p1.next;
//            p2 = p2.next;
//        }
//        return true;
//    }
//
//    private ListNode reverseList(ListNode head) {
//        Stack<Integer> stack = new Stack<>();
//        ListNode current = head;
//        while(current != null) {
//            stack.push(current.val);
//            current = current.next;
//        }
//
//        ListNode output = new ListNode(stack.pop());
//        current = output;
//        while(!stack.empty()) {
//            current.next = new ListNode(stack.pop());
//            current = current.next;
//        }
//
//        return output;
//    }

    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev;

        // get slow to the middle of the list
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse the second half of the list with slow
        prev = slow;
        slow = slow.next;
        ListNode temp = null;
        prev.next = null;
        while(slow != null) {
            temp = slow;
            slow = slow.next;
            temp.next = prev;
            prev = temp;
        }

        // second half the list has been reversed
        // iterate from front and back and check for issues
        fast = head;
        slow = prev;
        while(fast != null && slow != null) {
            if (fast.val != slow.val) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }

        return true;
    }

}
