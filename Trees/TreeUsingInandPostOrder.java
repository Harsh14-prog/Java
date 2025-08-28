package Trees;

import java.util.HashMap;
import java.util.Map;

public class TreeUsingInandPostOrder {

    // Static or class variable to track current index in postorder
    private int postIndex;

    // TreeNode definition
    public static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // Recursive function to build the tree
    private TreeNode constructTree(int[] inorder, int[] postorder, int inStart, int inEnd, Map<Integer, Integer> inorderMap) {
        if (inStart > inEnd) return null;

        int rootVal = postorder[postIndex--];  // pick current root
        TreeNode root = new TreeNode(rootVal);

        int rootIndex = inorderMap.get(rootVal);

        // Important: build right subtree first, then left
        root.right = constructTree(inorder, postorder, rootIndex + 1, inEnd, inorderMap);
        root.left = constructTree(inorder, postorder, inStart, rootIndex - 1, inorderMap);

        return root;
    }

    // Function to initialize and build the tree
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIndex = postorder.length - 1;  // initialize postIndex

        // Build a hashmap for fast lookup of index in inorder
        Map<Integer, Integer> inorderMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }

        return constructTree(inorder, postorder, 0, inorder.length - 1, inorderMap);
    }

    // Optional: print inorder for verification
    public void printInorder(TreeNode root) {
        if (root == null) return;
        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }

    // Main method to test
    public static void main(String[] args) {
        TreeUsingInandPostOrder treeBuilder = new TreeUsingInandPostOrder();

        int[] inorder = {9, 3, 15, 20, 7};
        int[] postorder = {9, 15, 7, 20, 3};

        TreeNode root = treeBuilder.buildTree(inorder, postorder);

        System.out.print("Inorder of constructed tree: ");
        treeBuilder.printInorder(root);
    }
}
