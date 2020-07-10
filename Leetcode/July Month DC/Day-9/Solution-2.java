class Solution {
	int max = 1;
	public int getMaxWidth(TreeNode root) {
		if(root == null) return 0;
		List<Integer> list = new ArrayList<>();
		helper(root, 0, 1, list);
		return max;
	}
	
	private void helper(TreeNode root, int level, int index, List<Integer> list) {
		if(root == null) return;
		if(level == list.size()) list.add(index);
		max = Math.max(max, index + 1 - list.get(level));
		helper(root.left, level+1, 2*index, list);
		helper(root.right, level+1, 2*index+1, list);
	}
}
