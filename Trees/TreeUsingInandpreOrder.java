package Trees;

import java.util.HashMap;
import java.util.Map;

class TreeUsingInandPreOrder {

    // Class variable to keep track of current index in preorder
    private int preIndex = 0;

    public static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // Function to build the tree
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preIndex = 0; // Initialize preIndex
        // Create a map to store value -> index in inorder for O(1) lookups
        Map<Integer, Integer> inorderMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }

        return constructTree(preorder, inorderMap, 0, inorder.length - 1);
    }

    private TreeNode constructTree(int[] preorder, Map<Integer, Integer> inorderMap, int inStart, int inEnd) {
        if (inStart > inEnd) return null; // Base case: no elements

        int rootVal = preorder[preIndex++];
        TreeNode root = new TreeNode(rootVal);

        int rootIndex = inorderMap.get(rootVal);

        root.left = constructTree(preorder, inorderMap, inStart, rootIndex - 1);
        root.right = constructTree(preorder, inorderMap, rootIndex + 1, inEnd);

        return root;
    }

    public void printInorder(TreeNode root) {
        if (root == null) return;
        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }

public static void main(String[] args) {
    TreeUsingInandPreOrder treeBuilder = new TreeUsingInandPreOrder();

    int[] preorder = {3, 9, 20, 15, 7};
    int[] inorder = {9, 3, 15, 20, 7};

    TreeNode root = treeBuilder.buildTree(preorder, inorder);

    System.out.print("Inorder of constructed tree: ");
    treeBuilder.printInorder(root);
}

}
