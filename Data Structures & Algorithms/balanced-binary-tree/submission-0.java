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
    
    
    public boolean isBalanced(TreeNode root) {
        int conditional = (checker(root));

        if (conditional != -1) {
            return true;
        }
        return false;

    }

    public int checker(TreeNode node) {
        int d  = 0;
        int left = 0;
        int right = 0;
        
        if (node == null) {
            return 0;
        }

        left += checker(node.left);
        right += checker(node.right);

        if (left == -1 || right == -1) {
            return -1;
        }

        d = Math.max(left, right) + 1;
        
        if (left - right > 1 || left - right < -1) {
            d = -1;
        }

        return d;
        
    }
}
