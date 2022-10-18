package com.box.leetcode.list;

import com.box.leetcode.ListNode;

/**
 * 描述
 *
 * @author gengbin29080
 * @date 2022/10/17
 */
public class InterSectionNode {
    public ListNode getInterSectionNode(ListNode headA, ListNode headB) {
        int aSize = 0, bSize = 0;

        ListNode aNode = headA;
        ListNode bNode = headB;
        while (aNode != null) {
            aSize++;
            aNode = aNode.next;
        }
        while (bNode != null) {
            bSize++;
            bNode = bNode.next;
        }
        int minus = Integer.max(aSize, bSize) - Integer.min(aSize, bSize);
        if (aSize > bSize) {
            for (int i = 0; i < minus; i++) {
                headA = headA.next;
            }
        } else if (aSize < bSize) {
            for (int i = 0; i < minus; i++) {
                headB = headB.next;
            }
        }

        while (headA != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        ListNode seven = new ListNode(7);
        ListNode eight = new ListNode(8);
        eight.next = seven;
        seven.next = four;

        InterSectionNode object = new InterSectionNode();
        System.out.println(object.getInterSectionNode(eight, one).val);
    }
}
