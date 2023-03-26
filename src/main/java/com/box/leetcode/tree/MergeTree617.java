package com.box.leetcode.tree;

import com.box.leetcode.TreeNode;
import java.util.Stack;

/**
 * 功能描述：
 *
 * @author gengbin29080
 * @date 2023/3/21
 */
public class MergeTree617 {

  public TreeNode mergeTreesR(TreeNode root1, TreeNode root2) {
    if (root1 == null) {
      return root2;
    }
    if (root2 == null) {
      return root1;
    }
    root1.val += root2.val;
    root1.left = mergeTreesR(root1.left, root2.left);
    root2.right = mergeTreesR(root1.right, root2.right);
    return root1;
  }

  public TreeNode mergeTreeI(TreeNode root1, TreeNode root2) {
    if (root1 == null) {
      return root2;
    }
    if (root2 == null) {
      return root1;
    }
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root2);
    stack.push(root1);
    while (!stack.isEmpty()) {
      TreeNode t1 = stack.pop();
      TreeNode t2 = stack.pop();
      t1.val += t2.val;
      if (t1.right != null && t2.right != null) {
        stack.push(t2.right);
        stack.push(t1.right);
      } else {
        if (t1.right == null) {
          t1.right = t2.right;
        }
      }
      if (t1.left != null && t2.left != null) {
        stack.push(t2.left);
        stack.push(t1.left);
      } else {
        if (t1.left == null) {
          t1.left = t2.left;
        }
      }
    }
    return root1;
  }
}
