/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if(root1 == null || root2 == null) {
            return false;
        }
        
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        dfs(root1, list1);
        dfs(root2, list2);
        if(list1.size() != list2.size()) {
            return false;
        }
        System.out.println(list1);
        System.out.println(list2);
        for(int i=0; i<list1.size(); i++) {
            if(list1.get(i) != list2.get(i)) {
                return false;
            }
        }
        
        return true;
    }
    
    private void dfs(TreeNode root, ArrayList<Integer> list) {
        if(root == null) return;
        else if(root.left == null && root.right == null) {
            list.add(root.val);
            return;
        }
        
        dfs(root.left, list);
        dfs(root.right, list);
    }
}
