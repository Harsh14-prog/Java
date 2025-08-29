package Trees;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class rightView {

    private static void dfs(TreeNode root, int level, List<Integer> res) {
        if (root == null) return;

        
        if (res.size() == level) {
            res.add(root.val);
        }

        
        dfs(root.right, level + 1, res);
        dfs(root.left, level + 1, res);
    }

    public static List<Integer> getRightView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(root, 0, res);
        return res;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.left.right.right = new TreeNode(7);

        List<Integer> rightViewNodes = getRightView(root);
        System.out.println(rightViewNodes); 
    }
}
