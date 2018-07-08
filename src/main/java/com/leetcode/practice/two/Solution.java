package com.leetcode.practice.two;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode l1_point  = l1;
        ListNode l2_point = l2;
        ListNode currentNode = null;
        int flag = 0; //进位标记
        while (l1_point != null || l2_point != null) {  //有一个为空也是可以直接相加的
            //考虑到不同位数相加的情况,使用0补齐变为位数相同再相加
            int x = (l1_point != null) ? l1_point.val : 0;
            int y = (l2_point != null) ? l2_point.val : 0;
            int sum  = x + y + flag;
            flag = sum / 10;
            if (result == null) {   //以result是否为空作为一个标志，防止头节点为空，浪费内存空间
                result = new ListNode(sum % 10);
                currentNode = result;
            } else {
                currentNode.next = new ListNode(sum % 10);
                currentNode = currentNode.next;
            }
            //进入到下一个节点再相加
           if (l1_point != null) {l1_point = l1_point.next;}
           if (l2_point != null) {l2_point = l2_point.next;}
        }
        //最后一个节点如果存在进位，就创建新的节点
        if (flag > 0) {
            currentNode.next = new ListNode(flag);
        }
        //最终结果是逆序排列的
        return result;
    }
}