/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    boolean balance = true;

    public boolean isBalanced(TreeNode root) {
        inOrder(root);
        return balance;
    }

    int inOrder(TreeNode node) {
        if (node == null) return 0;

        int leftDepth = inOrder(node.left);
        int rightDepth = inOrder(node.right);

        if (Math.abs(leftDepth - rightDepth) > 1) {
            balance = false;
        }
        
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
