package Tree;

import stacksandqueues.Queue;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;

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
}
