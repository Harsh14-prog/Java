package Trees;
import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class MorrisInorder {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        while (root != null) {
            if (root.left == null) {
                // No left child → visit and go right
                result.add(root.val);
                root = root.right;
            } else {
                // Find inorder predecessor
                TreeNode IP = root.left;
                while (IP.right != null && IP.right != root) {
                    IP = IP.right;
                }

                if (IP.right == null) {
                    // Make a thread
                    IP.right = root;
                    root = root.left;
                } else {
                    // Thread already exists → break it and visit root
                    IP.right = null;
                    result.add(root.val);
                    root = root.right;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        MorrisInorder obj = new MorrisInorder();
        List<Integer> inorder = obj.inorderTraversal(root);

        System.out.println("Inorder Traversal: " + inorder);
    }
}

