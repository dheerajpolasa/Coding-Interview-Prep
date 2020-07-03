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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        dfs(root, result, 0);
        return result;
    }
    
    private void dfs(TreeNode root, List<List<Integer>> result, int level) {
        if(root == null) {
            return;
        }
        if(level >= result.size()) {
            result.add(0, new ArrayList<>());
        }
        result.get(result.size() - level - 1).add(root.val);
        dfs(root.left, result, level+1);
        dfs(root.right, result, level+1);
    }
}
