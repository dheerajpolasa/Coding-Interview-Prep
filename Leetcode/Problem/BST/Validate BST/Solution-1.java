class Solution {
  public boolean isValidBST(TreeNode root) {
    if(root == null) {
      return true;
    }
    
    return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }
  
  private static boolean isValidBST(TreeNode root, int min, int max) {
    if(root == null) return true;
    
    if(root.val < min || root.val > max) return false;
    
    return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);
  }
}
