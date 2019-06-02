package TreeIntersection;

import java.util.ArrayList;
import java.util.Stack;

public class TreeIntersection {

    public static ArrayList printCommon(Node root1, Node root2) {
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();

        ArrayList <Integer> common = new ArrayList<Integer>();

        while (true) {

            if (root1 != null) {
                s1.push(root1);
                root1 = root1.left;
            } else if (root2 != null) {
                s2.push(root2);
                root2 = root2.left;
            } else if (!s1.isEmpty() && !s2.isEmpty()) {
                root1 = s1.peek();
                root2 = s2.peek();

                if (root1.key == root2.key) {
                    System.out.println(root1.key + " ");
                    common.add(root1.key);
                    s1.pop();
                    s2.pop();

                    root1 = root1.right;
                    root2 = root2.right;
                } else if (root1.key < root2.key) {
                    s1.pop();
                    root1 = root1.right;
                    root2 = null;
                } else if (root1.key > root2.key) {
                    s2.pop();
                    root2 = root2.right;
                    root1 = null;
                }
            } else break;

        }
        return common;
    }

    static void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.println(root.key + " ");
            inorderTraversal(root.right);
        }
    }
    public static Node insert(Node node, int key) {
        if (node == null) {
            return new Node (key);
        }
        if (key < node.key) {
            node.left = insert(node.left, key);
        } else if (key > node.key) {
            node.right = insert(node.right, key);
        }
        return node;
    }
}
