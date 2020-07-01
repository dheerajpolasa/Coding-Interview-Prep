class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) {
            return root;
        }
        return invert(root);
    }
    
    private TreeNode invert(TreeNode root) {
      if(root == null) return root;
      TreeNode temp = root.left;
      root.left = root.right;
      root.right = temp;
      root.left = invert(root.left);
      root.right = invert(root.right);
      return root;
    }
}
