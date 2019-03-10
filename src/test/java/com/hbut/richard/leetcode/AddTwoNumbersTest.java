package com.hbut.richard.leetcode;

import org.junit.Test;

public class AddTwoNumbersTest {
    @Test
    public void test() {
        AddTwoNumbers.ListNode one = new AddTwoNumbers.ListNode(2);
        one.next = new AddTwoNumbers.ListNode(4);
        one.next.next = new AddTwoNumbers.ListNode(3);

        AddTwoNumbers.ListNode two = new AddTwoNumbers.ListNode(5);
        two.next = new AddTwoNumbers.ListNode(6);
        two.next.next = new AddTwoNumbers.ListNode(4);

        AddTwoNumbers.addTwoNumbers1(one, two);
    }
}
