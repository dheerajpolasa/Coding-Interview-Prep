class Solution {
	public int getMaxWidth(TreeNode root) {
		if(root == null) return 0;
		Queue<Pair<TreeNode, Integer>> queue = new LinkedList<>();
		queue.add(new Pair(root, 0));
		while(!queue.isEmpty()) {
			Pair<TreeNode, Integer> first = queue.peek();
			int size = queue.size();
			TreeNode cur = null;
			for(int i=0; i<size; i++) {
				cur = queue.poll();
				TreeNode node = cur.getKey();
				int index = cur.getValue();
				if(node.left != null) queue.add(new Pair(node.left, 2*index));
				if(node.right != null) queue.add(new Pair(node.right, 2*index+1));
			}
			max = Math.max(max, cur.getValue() - first.getValue() + 1);
		}
		return max;
	}
}
