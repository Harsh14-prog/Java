package Trees;

import java.util.ArrayList;

class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}

public class BoundaryTraverse {

    public static void leftBoundary(Node root, ArrayList<Integer> list) {
        if (root == null) return;
        if (root.left == null && root.right == null) return;

        list.add(root.data);

        if (root.left != null) leftBoundary(root.left, list);
        else leftBoundary(root.right, list);
    }

    public static void rightBoundary(Node root, ArrayList<Integer> list) {
        if (root == null) return;
        if (root.left == null && root.right == null) return;

        if (root.right != null) rightBoundary(root.right, list);
        else rightBoundary(root.left, list);

        list.add(root.data); // add after recursion for bottom-up
    }

    public static void leafBoundary(Node root, ArrayList<Integer> list) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            list.add(root.data);
            return;
        }

        leafBoundary(root.left, list);
        leafBoundary(root.right, list);
    }

    public static ArrayList<Integer> boundaryTraversal(Node node) {
        ArrayList<Integer> list = new ArrayList<>();
        if (node == null) return list;

        list.add(node.data); // root
        leftBoundary(node.left, list);
        leafBoundary(node.left, list);
        leafBoundary(node.right, list);
        rightBoundary(node.right, list);

        return list;
    }

    // Example usage
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.right.left = new Node(8);
        root.left.right.right = new Node(9);

        ArrayList<Integer> result = boundaryTraversal(root);
        System.out.println(result); 
    }
}
