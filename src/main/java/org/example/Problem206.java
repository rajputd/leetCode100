package org.example;

import java.util.List;
import java.util.Stack;

public class Problem206 {



    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


// iterative
//    public ListNode reverseList(ListNode head) {
//        // if we get nothing return nothing
//        if (head == null) {
//            return null;
//        }
//
//        // push all the list elements on to a LIFO stack
//        Stack<Integer> stack = new Stack<>();
//        ListNode current = head;
//        while(current != null) {
//            stack.push(current.val);
//            current = current.next;
//        }
//
//        // build a new list with the LIFO stack
//        ListNode output = new ListNode(stack.pop());
//        current = output;
//        while(!stack.empty()) {
//            ListNode newNode = new ListNode(stack.pop());
//            current.next = newNode;
//            current = newNode;
//        }
//
//        return output;
//    }

    // recursive
    public ListNode reverseList(ListNode head) {
        // if we get nothing return nothing
        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return new ListNode(head.val);
        }

        ListNode reversed = reverseList(head.next);
        ListNode current = reversed;
        while(current.next != null) {
            current = current.next;
        }
        current.next = new ListNode(head.val);
        return reversed;
    }
}
