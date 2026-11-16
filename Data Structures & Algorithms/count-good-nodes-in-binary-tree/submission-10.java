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
    int count = 0;
    
    public int goodNodes(TreeNode root) {
        if (root == null) return 0;

        int max = Integer.MIN_VALUE;

        digger(root, max);
        
        return count;
    }



    public void digger(TreeNode root, int max) {
        if (root == null) return ;

        if (root.val > max) max = root.val;

        if (root.val >= max) {
            count++;
        }
        
        digger(root.left, max);
        digger(root.right, max);
        
    }
}
