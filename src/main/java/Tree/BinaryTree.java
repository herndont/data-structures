package Tree;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public abstract class BinaryTree {
    public Node root;

    //Define a method called preOrder
    public void preOrder(Node node, ArrayList<Integer> preorder) {
        if (node != null) {
            preorder.add(node.data);
            System.out.println(preorder);
            preOrder(node.left, preorder);
            preOrder(node.right, preorder);
        }
    }

    //Define a method called postOrder
    public void postOrder(Node node, ArrayList<Integer> postorder) {
        if (node != null) {
            postOrder(node.left, postorder);
            postOrder(node.right, postorder);
            postorder.add(node.data);
            System.out.println(" " + node.data);
        }
    }

    //Define a method called inOrder
    public void inOrder(Node node, ArrayList<Integer> inorder) {
        if (node != null) {
            inOrder(node.left, inorder);
            inorder.add(node.data);
            System.out.println(node.data);
            inOrder(node.right, inorder);
        }
    }

    public void breadthFirst(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (queue.isEmpty()) {
            Node poppedNode = queue.remove();
            System.out.println(" " + poppedNode.data);
            if (poppedNode.left != null) {
                queue.add(poppedNode.left);
            }
            if (poppedNode.right != null) {
                queue.add(poppedNode.right);
            }
        }
    }

    public int findMax(Node root) {
        int maxVal;
        Queue<Node> queue = new LinkedList<>();
        Node currentNode = root;
        while (!queue.isEmpty() || currentNode != null) {
            if (currentNode != null) {
                queue.add(currentNode);
                currentNode = currentNode.left;

            } else {
                currentNode = queue.remove();
            }
        }
        return 0;
    }
}
