package com.box.leetcode.list;

import com.box.leetcode.ListNode;

/**
 * 描述
 *
 * @author gengbin29080
 * @date 2022/10/16
 */
public class DesignList {
    private int size;
    private ListNode head;

    public DesignList() {
        this.size = 0;
        this.head = new ListNode(0);
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public int get(int index) {
        if(index<0||index>size){
            return -1;
        }
        ListNode pre = head;
        for(int i =0;i<index;i++){
            pre = pre.next;
        }
        return pre.next.val;
    }

    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        if (index < 0) {
            index = 0;
        }
        size++;
        ListNode pre = head;
        //找到目标位置之前的一个节点
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        ListNode newNode = new ListNode(val);
        newNode.next = pre.next;
        pre.next = newNode;
    }

    public void deleteAtIndex(int index) {
        if (index > size || index < 0) {
            return;
        }
        size--;
        if (index == 0) {
            head = head.next;
            return;
        }
        ListNode pre = head;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        pre.next = pre.next.next;
    }

    public ListNode removeNthFromEnd(ListNode head,int n){
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode fast = dummyNode;
        ListNode slow = dummyNode;
        for(int i=0;i<=n;i++){
            fast = fast.next;
        }

        while (fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next= slow.next.next;
        return dummyNode.next;
    }

    public static void main(String[] args) {
        DesignList designList = new DesignList();
        designList.addAtHead(1);
        designList.addAtTail(2);
        designList.addAtTail(3);
        designList.addAtTail(4);
        designList.addAtTail(5);

        designList.removeNthFromEnd(designList.head.next,2);

        ListNode head = designList.head.next;
        while (head!=null){{
            System.out.println(head.val);
            head = head.next;
        }

        }
    }
}
