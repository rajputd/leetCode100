package org.example;

import java.util.HashSet;
import java.util.Set;

public class Problem160 {
    public static class ListNode {
        int val;
        Problem160.ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    // naive
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        // load everything in list A to a set for look ups
//        Set<ListNode> seen = new HashSet<>();
//        ListNode current = headA;
//        while(current != null) {
//            seen.add(current);
//            current = current.next;
//        }
//
//        current = headB;
//        while(current != null) {
//            if (seen.contains(current)) {
//                return current;
//            }
//            current = current.next;
//        }
//
//        return null;
//    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // load everything in list A to a set for look ups
        Set<ListNode> seen = new HashSet<>();
        ListNode current = headA;
        while(current != null) {
            seen.add(current);
            current = current.next;
        }

        current = headB;
        while(current != null) {
            if (seen.contains(current)) {
                return current;
            }
            current = current.next;
        }

        return null;
    }
}
