package com.box.leetcode.list;

import com.box.leetcode.ListNode;

import java.util.ArrayList;

/**
 * 描述
 *
 * @author gengbin29080
 * @date 2022/5/31
 */
public class LinkedList {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();

        while (head!=null){
            list.add(head.val);
            head = head.next;
        }

        for(int i =0;i<list.size()/2;i++){
            if(!list.get(i).equals(list.get(list.size()-1-i))){
                return false;
            }
        }
        return true;
    }
}
