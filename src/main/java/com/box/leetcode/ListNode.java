package com.box.leetcode;

/**
 * 描述
 *
 * @author gengbin29080
 * @date 2022/5/31
 */
public class ListNode {
    public int val;
    public ListNode next;

    ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
