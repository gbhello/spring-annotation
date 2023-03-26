package com.box.leetcode.tree;

import com.box.leetcode.TreeNode;

import java.text.NumberFormat;
import java.util.*;

/**
 * 描述
 *
 * @author gengbin29080
 * @date 2022/10/20
 */
public class Tree {
    public static void main(String[] args) {
//        Tree tree = new Tree();
//        TreeNode root = TreeNode.init();
//        System.out.println(tree.preorderTraversal(root));
        float f = 1;
        System.out.println(++f);
        NumberFormat format = NumberFormat.getInstance();
        format.setMaximumFractionDigits(5);
        System.out.println(format.format(f/3));
    }
    public boolean isSymmetric(TreeNode root){
        if(root==null){
            return true;
        }
        return compare(root.left,root.right);
    }

    private boolean compare(TreeNode left, TreeNode right) {
        if(left!=null&&right==null){
            return false;
        }
        if(left==null&&right!=null){
            return false;
        }
        if(left==null&&right==null){
            return true;
        }
        if(left.val==right.val){
            return true;
        }
        boolean result1 = compare(left.left, right.right);
        boolean result2 = compare(left.right, right.left);

        return result1&&result2;
    }


    public TreeNode invertTreeDFS(TreeNode root){
        if(root==null){
            return null;
        }
        invertTreeDFS(root.left);
        invertTreeDFS(root.right);
        swapChildren(root);
        return root;
    }
    public TreeNode invertTreeBFS(TreeNode root){
        if(root==null){
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            int size = queue.size();

            while (size>0){
                TreeNode node = queue.poll();
                swapChildren(node);
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
                size--;
            }
        }
        return root;
    }

    private void swapChildren(TreeNode root) {
        TreeNode temp = root.left;
        root.left = root.right;
        root.right=temp;
    }

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){

            int size = queue.size();
            int len = queue.size();

            Double sum=0.0;;
            while(size>0){
                TreeNode node = queue.poll();
                sum=sum+node.val;
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
                size--;
            }
            result.add(sum/len);
        }
        return result;
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            int size = queue.size();

            while (size > 0) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
                size--;
            }
            result.add(list);
        }
        return result;
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            result.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return result;
    }

    public List<Integer> preorderTraversalR(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        preorder(root, result);
        return result;
    }

    private void preorder(TreeNode root, ArrayList<Integer> result) {
        if (root == null) {
            return;
        }
        result.add(root.val);
        preorder(root.left, result);
        preorder(root.right, result);
    }

    public List<Integer> inorderTraversalR(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    private void inorder(TreeNode root, ArrayList<Integer> result) {
        if (root == null) {
            return;
        }
        inorder(root.left, result);
        result.add(root.val);
        inorder(root.right, result);
    }

    public List<Integer> postorderTraversalR(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        postorder(root, result);
        return result;
    }

    private void postorder(TreeNode root, ArrayList<Integer> result) {
        if (root == null) {
            return;
        }
        postorder(root.left, result);
        postorder(root.right, result);
        result.add(root.val);
    }


}
