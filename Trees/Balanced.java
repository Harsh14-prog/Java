package Trees;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public static int getHeight(TreeNode root) {
        if (root == null) return 0;

        int left = getHeight(root.left);
        int right = getHeight(root.right);

        // If any subtree is unbalanced, propagate -1 upwards
        if (left == -1 || right == -1) return -1;

        // If difference is more than 1 -> unbalanced
        if (Math.abs(left - right) > 1) return -1;

        return Math.max(left, right) + 1;
    }

    public boolean isBalanced(TreeNode root) {
        return getHeight(root) != -1;
    }
}

public class Balanced {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2, new TreeNode(4), new TreeNode(5));
        root.right = new TreeNode(3);

        Solution sol = new Solution();
        System.out.println("Is Balanced? " + sol.isBalanced(root)); // true

        TreeNode unbalanced = new TreeNode(1);
        unbalanced.left = new TreeNode(2);
        unbalanced.left.left = new TreeNode(3);

        System.out.println("Is Balanced? " + sol.isBalanced(unbalanced)); // false
    }
}
