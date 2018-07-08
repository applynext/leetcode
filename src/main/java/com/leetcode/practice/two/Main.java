package com.leetcode.practice.two;

public class Main {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l1_point = l1;
        l1_point.next = new ListNode(4);
        l1_point = l1_point.next;
        l1_point.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        ListNode l2_point = l2;
        l2_point.next = new ListNode(6);
        l2_point = l2_point.next;
        l2_point.next = new ListNode(4);

        ListNode result = new Solution().addTwoNumbers(l1,l2);
        while(result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
