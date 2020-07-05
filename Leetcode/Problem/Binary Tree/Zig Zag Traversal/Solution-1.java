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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        boolean isLeftToRight = true;
        queue.add(root);
        while(!queue.isEmpty()) {
            List<Integer> cur = new ArrayList<>();
            int size = queue.size();
            for(int i=0; i<size; i++) {
                TreeNode curNode = queue.poll();
                if(isLeftToRight) {
                    cur.add(curNode.val);
                } else {
                    cur.add(0, curNode.val);
                }
                if(curNode.left != null) queue.add(curNode.left);
                if(curNode.right != null) queue.add(curNode.right);
            }
            res.add(cur);
            isLeftToRight = !isLeftToRight;
        }
        
        return res;
    }
}
