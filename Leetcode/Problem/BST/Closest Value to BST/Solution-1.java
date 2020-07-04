class Solution {
  public int findClosest(TreeNode root, double target) {
    if(root == null) {
      return -1;
    }
    ArrayList<Integer> list = new ArrayList<>();
    findClosestValue(root, list);
    int min_diff = Integer.MAX_VALUE, min_val = -1;
    for(int i=0; i<list.size(); i++) {
      if(min_diff > Math.abs(list.get(i)-k)) {
        min_diff = Math.abs(list.get(i)-k);
        min_val = list.get(i);
      }
    }
    
    return min_val;
  }
  
  private int findClosestValue(TreeNode root, ArrayList<Integer> list) {
    if(root == null) {
      return -1;
    }
    
    findClosestValue(root.left, list);
    list.add(root.val);
    findClosestValue(root.right, list);
  }
}
