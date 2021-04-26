package ua.com.serzh.leetcode;

import java.util.HashSet;
import java.util.Set;

/* 653. Two Sum IV - Input is a BST
Given the root of a Binary Search Tree and a target number k,
return true if there exist two elements in the BST such that their sum is equal to the given target.

Input: root = [5,3,6,2,4,null,7], k = 9
Output: true

Input: root = [5,3,6,2,4,null,7], k = 28
Output: false

Input: root = [2,1,3], k = 4
Output: true

Input: root = [2,1,3], k = 1
Output: false

Input: root = [2,1,3], k = 3
Output: true
*/
public class TwoSumBinarySearchTree {
    public static void main(String[] args) {
        TreeNode left = new TreeNode(3, new TreeNode(2), new TreeNode(4));
        TreeNode right = new TreeNode(6, null, new TreeNode(7));

        TreeNode root = new TreeNode(5, left, right);

//        Input: root = [5,3,6,2,4,null,7], k = 9
//        Output: true

        System.out.println(root);

        TwoSumBinarySearchTree main = new TwoSumBinarySearchTree();

        boolean target = main.findTarget(root, 9);
        System.out.println(target);
    }

    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        return find(root, k, set);
    }

    public boolean find(TreeNode root, int k, Set<Integer> set) {
        if (root == null)
            return false;
        if (set.contains(k - root.val))
            return true;
        set.add(root.val);
        return find(root.left, k, set) || find(root.right, k, set);
    }
}

// 1
// 2
// 3
