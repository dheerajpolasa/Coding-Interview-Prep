import java.util.*;

class Solution {
  public TreeNode invert(TreeNode root) {
    if(root == null) {
      return root;
    }
    
    return invertTree(root);
  }
  
  private TreeNode invertTree(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    while(!queue.isEmpty()) {
      TreeNode cur = queue.offer();
      TreeNode temp = cur.left;
      cur.left = cur.right;
      cur.right = temp;
      if(cur.left != null) cur.offer(cur.left);
      if(cur.right != null) cur.offer(cur.right);
    }
    
    return root;
  }
  
}
