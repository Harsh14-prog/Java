package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}

public class createTree {

    static Scanner sc = new Scanner(System.in);

    // Create tree from input (-1 means no node)
    public static Node BinaryTree() {
        int val = sc.nextInt();
        if (val == -1) return null;

        Node root = new Node(val);
        root.left = BinaryTree();
        root.right = BinaryTree();
        return root;
    }

    // PreOrder (Root -> Left -> Right)
    public static void preOrderTraversal(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    // InOrder (Left -> Root -> Right)
    public static void inOrderTraversal(Node root) {
        if (root == null) return;
        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }

    // PostOrder (Left -> Right -> Root)
    public static void postOrderTraversal(Node root) {
        if (root == null) return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }

    // Level Order (BFS)
    public static void levelOrderTraversal(Node root) {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node temp = q.poll(); // get and remove front
            System.out.print(temp.data + " ");

            if (temp.left != null) q.add(temp.left);
            if (temp.right != null) q.add(temp.right);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter nodes of tree (-1 for null):");
        Node root = BinaryTree();

        System.out.println("\nPreOrder:");
        preOrderTraversal(root);

        System.out.println("\nInOrder:");
        inOrderTraversal(root);

        System.out.println("\nPostOrder:");
        postOrderTraversal(root);

        System.out.println("\nLevelOrder:");
        levelOrderTraversal(root);
    }
}
