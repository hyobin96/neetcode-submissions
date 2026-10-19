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
    public TreeNode invertTree(TreeNode root) {
        return rInvertTree(root);
    }

    private TreeNode rInvertTree(TreeNode node) {
        if (node == null) return null;

        TreeNode temp = node.left;
        node.left = rInvertTree(node.right);
        node.right = rInvertTree(temp);

        return node;
    }
}
