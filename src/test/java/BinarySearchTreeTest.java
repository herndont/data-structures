import Tree.BinarySearchTree;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    @Test
    public void preOrder() {
//        Can successfully return a collection from a preorder traversal
        BinarySearchTree searchTree = new BinarySearchTree();
        searchTree.addFromRoot(4);
        searchTree.addFromRoot(2);
        searchTree.addFromRoot(6);
        searchTree.addFromRoot(5);
        searchTree.addFromRoot(10);

        ArrayList<Integer> preorder = new ArrayList();
        searchTree.preOrder(searchTree.root, preorder);

        Assert.assertEquals(4, (int)preorder.get(0));
        Assert.assertEquals(2, (int)preorder.get(1));
        Assert.assertEquals(6, (int)preorder.get(2));
        Assert.assertEquals(5, (int)preorder.get(3));
        Assert.assertEquals(10, (int)preorder.get(4));
    }

    @Test
    public void postOrder() {
//        Can successfully return a collection from a postorder traversal
        BinarySearchTree searchTree = new BinarySearchTree();
        searchTree.addFromRoot(4);
        searchTree.addFromRoot(2);
        searchTree.addFromRoot(6);
        searchTree.addFromRoot(5);
        searchTree.addFromRoot(10);

        ArrayList<Integer> postorder = new ArrayList();
        searchTree.postOrder(searchTree.root, postorder);

        Assert.assertEquals(2, (int)postorder.get(0));
        Assert.assertEquals(5, (int)postorder.get(1));
        Assert.assertEquals(10, (int)postorder.get(2));
        Assert.assertEquals(6, (int)postorder.get(3));
        Assert.assertEquals(4, (int)postorder.get(4));
    }

    @Test
    public void inOrder() {
//        Can successfully return a collection from an inorder traversal
        BinarySearchTree searchTree = new BinarySearchTree();
        searchTree.addFromRoot(4);
        searchTree.addFromRoot(2);
        searchTree.addFromRoot(6);
        searchTree.addFromRoot(5);
        searchTree.addFromRoot(10);

        ArrayList<Integer> inorder = new ArrayList();
        searchTree.inOrder(searchTree.root, inorder);

        Assert.assertEquals(2, (int)inorder.get(0));
        Assert.assertEquals(4, (int)inorder.get(1));
        Assert.assertEquals(5, (int)inorder.get(2));
        Assert.assertEquals(6, (int)inorder.get(3));
        Assert.assertEquals(10, (int)inorder.get(4));

    }

    @Test
    public void addFromRoot() {
        BinarySearchTree searchTree = new BinarySearchTree();
//        Can successfully instantiate an empty tree
        Assert.assertEquals(null, searchTree.root);
//        Can successfully instantiate a tree with a single root node
        searchTree.addFromRoot(5);
//        Can successfully add a left child and right child to a single root node
        searchTree.addFromRoot(2);
        searchTree.addFromRoot(6);

        Assert.assertEquals(5, searchTree.root.data);
        Assert.assertEquals(2, searchTree.root.left.data);
        Assert.assertEquals(6, searchTree.root.right.data);
    }

    @Test
    public void contains() {
//        tests for whether the tree contains a certain data value
        BinarySearchTree searchTree = new BinarySearchTree();
        searchTree.addFromRoot(5);
        searchTree.addFromRoot(2);
        searchTree.addFromRoot(6);

        Assert.assertEquals(true, searchTree.contains(5));
        Assert.assertEquals(false, searchTree.contains(3));
        Assert.assertEquals(true, searchTree.contains(6));
    }
}