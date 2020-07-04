class Solution {
  public List<Integer> mergeTwoBST(TreeNode root1, TreeNode root2) {
    List<Integer> result = new ArrayList<Integer>();
    inorder(root1, result);
    inorder(root2, result);
    Collections.sort(result);
    return result;
  }
  
  private void inorder(TreeNode root, List<Integer> result) {
    if(root == null) return;
    
    inorder(root.left, result);
    result.add(root.val);
    inorder(root.right, result);
  }
}
