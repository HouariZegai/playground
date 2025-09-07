package org.zegai.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {
        ListNode ln = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        new RemoveDuplicatesFromSortedList().deleteDuplicates(ln).print();
        new RemoveDuplicatesFromSortedList().deleteDuplicates(new ListNode()).print();
        new RemoveDuplicatesFromSortedList().deleteDuplicates(new ListNode(1)).print();
    }

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode prev = head;
        ListNode current = prev.next;
        while(current != null) {
            if(prev.val == current.val) {
                prev.next = current.next;
                current.next = null;
                current = prev.next;
            } else {
                prev = prev.next;
                current = prev.next;
            }

        }

        return head;
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void print() {
        ListNode p = next;
        System.out.print(val + " ");
        while(p != null) {
            System.out.print(p.val + " ");
            p = p.next;
        }
        System.out.println();
    }
}
