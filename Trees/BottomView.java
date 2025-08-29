package Trees;

import java.util.*;

// Node class
class Node {
    int data;
    int hd; // horizontal distance
    Node left, right;

    public Node(int key) {
        data = key;
        hd = Integer.MAX_VALUE;
        left = right = null;
    }
}

// Pair class to hold node and horizontal distance
class Pair {
    Node node;
    int hd;

    Pair(Node node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}

public class BottomView {

    // Method to return bottom view of a binary tree
    public static ArrayList<Integer> bottomView(Node root) {
        if (root == null) return new ArrayList<>();

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));

        Map<Integer, Integer> mp = new TreeMap<>();

        while (!q.isEmpty()) {
            Pair current = q.poll();
            int hd = current.hd;
            Node node = current.node;

            // Overwrite for bottom view
            mp.put(hd, node.data);

            if (node.left != null) q.add(new Pair(node.left, hd - 1));
            if (node.right != null) q.add(new Pair(node.right, hd + 1));
        }

        return new ArrayList<>(mp.values());
    }

    // Example usage
    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.right = new Node(25);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);

        ArrayList<Integer> result = bottomView(root);
        System.out.println("Bottom View: " + result);
    }
}
