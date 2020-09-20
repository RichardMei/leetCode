package com.hbut.richard.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * author Richard
 * date 2020-09-20 13:57
 */
public class RemoveNthFromEnd {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int len = 0;
        ListNode point = head;
        while (point != null) {
            len++;
            point = point.next;
        }
        point = dummy;
        for (int i = 0; i < len -n; i++) {
            point = point.next;
        }
        point.next = point.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        removeNthFromEnd(node1, 5);
    }
}
