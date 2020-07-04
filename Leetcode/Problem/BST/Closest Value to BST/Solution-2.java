class Solution {
	static int min_diff, min_val;
	public int findClosest(TreeNode root, double target) {
		if(root == null) {
			return -1;
		}
		min_diff = Integer.MAX_VALUE;
		min_val = -1;
		find(root, target);
		return min_val;
	}
	
	private static void find(TreeNode root, double target) {
		if(root == null) {
			return -1;
		}
		int abs = Math.abs(root.val - target);
		if(min_diff > abs) {
			min_diff = abs;
			min_val = root.val;
		}
		
		if(root.val < target) {
			find(root.right, target);
		} else {
			find(root.left, target);
		}
	}
}
