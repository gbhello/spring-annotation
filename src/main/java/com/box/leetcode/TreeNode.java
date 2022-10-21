package com.box.leetcode;

/**
 * 描述
 *
 * @author gengbin29080
 * @date 2022/4/13
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }


    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    /**
     * 二叉树结构：
     *        4
     *       / \
     *    3       5
     *   / \    /   \
     * 1    2   6   7
     *
     * @return
     */
    public static TreeNode init() {
        TreeNode leftLeaf1 = new TreeNode(1);
        TreeNode rightLeaf1 = new TreeNode(2);
        TreeNode leftLeaf2 = new TreeNode(6);
        TreeNode rightLeaf2 = new TreeNode(7);
        TreeNode middleNode1 = new TreeNode(3, leftLeaf1, rightLeaf1);
        TreeNode middleNode2 = new TreeNode(5, leftLeaf2, rightLeaf2);
        TreeNode root = new TreeNode(4, middleNode1, middleNode2);
        return root;


    }
}
