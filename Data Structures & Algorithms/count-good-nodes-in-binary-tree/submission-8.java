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
    public int goodNodes(TreeNode root) {
        int sum = 0;
        if (root == null) {
            return 0;
        }

        return digger(root, root.val);
    }

    public int digger(TreeNode node, int max) {
        int curr = 0;
        if (node == null) {
            return 0;
        }

        if (node.val >= max) {
            max = node.val;
            curr = 1;
        }

        int left = digger(node.left, max);
        int right = digger(node.right, max);


        return (left + right + curr);

    }
}
