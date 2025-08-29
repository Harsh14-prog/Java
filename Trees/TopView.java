package Trees;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

class Pair {
    TreeNode node;
    int hd;   // horizontal distance

    Pair(TreeNode node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}

public class TopView {

    public List<Integer> topView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        // Step 1: Map to store first node at each HD
        Map<Integer, Integer> mp = new TreeMap<>();

        // Step 2: Queue for BFS
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0)); // root has hd = 0

        // Step 3: BFS traversal
        while (!q.isEmpty()) {
            Pair curr = q.poll();
            TreeNode node = curr.node;
            int hd = curr.hd;

            // store only if this hd is seen for first time
            if (!mp.containsKey(hd)) {
                mp.put(hd, node.val);
            }

            // left child => hd - 1
            if (node.left != null) {
                q.add(new Pair(node.left, hd - 1));
            }

            // right child => hd + 1
            if (node.right != null) {
                q.add(new Pair(node.right, hd + 1));
            }
        }

        // Step 4: Collect results from map (sorted by hd automatically in TreeMap)
        for (int val : mp.values()) {
            result.add(val);
        }

        return result;
    }
    public static void main(String[] args) {
        // Build the sample tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.left.right.right = new TreeNode(5);
        root.left.right.right.right = new TreeNode(6);

        // Call topView
        TopView tv = new TopView();
        List<Integer> ans = tv.topView(root);

        // Print result
        System.out.println("Top View: " + ans);
    }
}
