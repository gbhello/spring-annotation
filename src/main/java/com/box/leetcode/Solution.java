package com.box.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 描述
 *
 * @author gengbin29080
 * @date 2022/4/13
 */
public class Solution {
    public static void main(String[] args) {
        int[] ints = countBits(5);
        Arrays.stream(ints).forEach(System.out::println);
    }

    public static int[] countBits(int n) {
        int[] arr = new int[n+1];
        for(int i =0;i<=n;i++){
            arr[i] = calcuBit(i);
        }
        return arr;
    }

    private static int calcuBit(int i) {
        int count = 0;
        while (i!=0){
            i&=i-1;
            count++;
        }
        return count;
    }

    //快排
    public void moveZeroes(int[] nums) {
        int length = nums.length,left = 0,right = 0;
        while (right<length){
            if(nums[right]!=0){
                swap(nums,left,right);
                left++;
            }
            right++;
        }
    }
    private void swap(int[] nums,int left,int right){
        int i = nums[left];
        nums[left] = nums[right];
        nums[right]=i;
    }

    public static List<Integer> treeNodeTraversal(TreeNode root){
        ArrayList<Integer> res = new ArrayList<>();

//        inorder(root,res);
//        preorder(root,res);
        postorder(root,res);
        return res;
    }

    private static void inorder(TreeNode root, ArrayList<Integer> res) {
        if(root==null){
            return;
        }
        inorder(root.left,res);
        res.add(root.val);
        inorder(root.right,res);
    }

    private static void preorder(TreeNode root,ArrayList<Integer> res){
        if(root == null){
            return;
        }
        res.add(root.val);
        preorder(root.left,res);
        preorder(root.right,res);
    }
    private static void postorder(TreeNode root,ArrayList<Integer> res){
        if(root == null){
            return;
        }
        postorder(root.left,res);
        postorder(root.right,res);
        res.add(root.val);
    }
}
