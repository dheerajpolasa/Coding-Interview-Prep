import java.util.*;

public class Solution {
    static int res = 0;
	public static int ksmallestElementSum(BinaryTreeNode<Integer> root, int k) {
		/*
		 * Your class should be named Solution.Don't write main().Don't take
		 * input, it is passed as function argument.Don't print output.Taking
		 * input and printing output is handled automatically.
		 */
		if(root == null) {
            return 0;
        }
        res = 0;
        ArrayList<Integer> list = new ArrayList<>();
        save(root, list);
        for(int i=0; i<k; i++) {
            res += list.get(i);
        }
        return res;
	}
    
    private static void save(BinaryTreeNode<Integer> root, ArrayList<Integer> list) {
        if(root == null) {
            return;
        }
        save(root.left, list);
        list.add(root.data);
        save(root.right, list);
    }

}
