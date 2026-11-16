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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        
        List<List<Integer>> listy = new ArrayList<>();
        
        Deque<TreeNode> qu = new ArrayDeque<>();
        qu.add(root);

        while (!qu.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            
            TreeNode curr = null;

            int len = qu.size();            

            for (int i = 0; i < len; i++) {
                curr = qu.poll();
                list.add(curr.val);
                if (curr.left != null) {
                    qu.add(curr.left);
                }
                if (curr.right != null) {
                    qu.add(curr.right);
                }
            }
            listy.add(list);
        } 
        return listy;
    }
}
