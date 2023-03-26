package com.box.leetcode.tree;

import com.box.leetcode.TreeNode;

/**
 * 功能描述：
 *
 * @author gengbin29080
 * @date 2023/3/23
 */
public class SearchBST700 {

  public TreeNode searchBST(TreeNode root, int val) {
    if (root == null || root.val == val) {
      return root;
    }
    if(val<root.val){
      return searchBST(root.left,val);
    }else {
      return searchBST(root.right,val);
    }
  }

  public TreeNode searchBST1(TreeNode root, int val) {
    if (root == null || root.val == val) {
      return root;
    }
    TreeNode treeNode = searchBST1(root.left, val);
    if(treeNode==null){
      treeNode = searchBST1(root.right,val);
    }
    return treeNode;
  }
}
