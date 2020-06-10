import java.util.*;

public class solution {
	static void printMergeTrees(BinaryTreeNode<Integer> root1,
			BinaryTreeNode<Integer> root2) {
        
        ArrayList<Integer> inorder = new ArrayList<>();
        inorder(root1, inorder);
        inorder(root2, inorder);
        Collections.sort(inorder);
        BinaryTreeNode<Integer> mergedTree = newTree(inorder, 0, inorder.size()-1);
        printInorder(mergedTree);
	}
    
    private static void printInorder(BinaryTreeNode<Integer> root) {
        if(root == null) {
            return;
        }
        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }
    
    private static void inorder(BinaryTreeNode<Integer> root, ArrayList<Integer> inorder) {
        if(root == null) {
            return;
        }
        inorder(root.left, inorder);
        inorder.add(root.data);
        inorder(root.right, inorder);
    }
    
    private static BinaryTreeNode<Integer> newTree(ArrayList<Integer> inorder, int start, int end) {
        if(start > end) {
            return null;
        }
        int mid = start + (end - start)/2;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(inorder.get(mid));
        root.left = newTree(inorder, start, mid-1);
        root.right = newTree(inorder, mid+1, end);
        return root;
    }

}
