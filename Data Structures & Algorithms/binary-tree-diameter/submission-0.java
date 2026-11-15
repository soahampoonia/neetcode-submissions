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
    int diameter;
    
    public int diameterOfBinaryTree(TreeNode root) {
        getDepth(root);

        return diameter;
    }

    public int getDepth(TreeNode node) {
        int maxDepth = 0;
        int left = 0;
        int right = 0;
        
        if (node == null) {
            return maxDepth;
        }

        left += getDepth(node.left);
        right += getDepth(node.right);

        maxDepth = Math.max(left, right) + 1;

       diameter = Math.max(diameter, left + right);

        return maxDepth;

    }
}
