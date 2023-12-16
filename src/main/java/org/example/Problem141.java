package org.example;

import java.util.HashSet;
import java.util.Set;

public class Problem141 {


    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    // Naive solution
//    public boolean hasCycle(Problem141.ListNode head) {
//        Set<ListNode> seenNodes = new HashSet<>();
//        ListNode current = head;
//        while(current != null) {
//            if (seenNodes.contains(current)) {
//                return true;
//            }
//            seenNodes.add(current);
//            current = current.next;
//        }
//
//        return false;
//    }

    public boolean hasCycle(Problem141.ListNode head) {
        ListNode hare = head;
        ListNode tortise = head;
        while(hare != null && tortise != null) {
            tortise = tortise.next;
            hare = hare.next != null ? hare.next.next : null;
            if (tortise == hare && tortise != null && hare != null) {
                return true;
            }
        }

        return false;
    }
}
