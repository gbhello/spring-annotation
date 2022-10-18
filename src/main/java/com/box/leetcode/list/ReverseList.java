package com.box.leetcode.list;

import com.box.leetcode.ListNode;

/**
 * 描述
 *
 * @author gengbin29080
 * @date 2022/10/16
 */
public class ReverseList {
    //双指针
    public ListNode reverseList(ListNode head){
        ListNode pre=null;
        ListNode cur = head;
        ListNode temp = null;
        while (cur!=null){
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur=temp;
        }
        return pre;
    }
    //递归

}
