package Tree;

public class BinarySearchTree extends BinaryTree {

    // Define a method called add
    private Node add(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }
        if (data < current.data) {
            current.left = add(current.left, data);
        } else if (data > current.data) {
            current.right = add(current.right, data);
        } else {
            return current;
        }
        return current;
    }

    //Method created to add a data value to the root
    public void addFromRoot(int data) {
        root = add(root, data);
    }

    public boolean contains(int data) {
        return treeContains(root, data);
    }

    //Define a method called contains
    public boolean treeContains(Node root, int data) {
        if (root == null) {
            return false;
        }
        if (data == root.data) {
            return true;
        }
        return data < root.data
                ? treeContains(root.left, data)
                : treeContains(root.right, data);
    }
}
