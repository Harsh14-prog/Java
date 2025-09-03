package Trees;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class TotalNode {

    public static int leftHeight(TreeNode root) {
        int count = 0;
        while (root != null) {
            root = root.left;
            count++;
        }
        return count;
    }

    public static int rightHeight(TreeNode root) {
        int count = 0;
        while (root != null) {
            root = root.right;
            count++;
        }
        return count;
    }

    public int countNodes(TreeNode root) {
        if (root == null) return 0;

        int leftht = leftHeight(root);
        int rightht = rightHeight(root);

        if (leftht == rightht) {
            return (1 << leftht) - 1; // 2^h - 1
        } else {
            return 1 + countNodes(root.left) + countNodes(root.right);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        TotalNode tn = new TotalNode();
        System.out.println("Total Nodes = " + tn.countNodes(root)); 
    }
}
