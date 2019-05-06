
# Implement a Binary Tree and a BST
### Lab 15

    This challenge is for the creation and navigation of a Binary tree. Leaf nodes have two child leaf nodes attached to
    the left and to the right below the parent and so on, creating a tree. The largest valued nodes are located to the 
    right side of the tree and the smallest valued nodes are located to the left side of the tree.

    Information for this lab was used from the following links:
        https://www.baeldung.com/java-binary-tree
        https://www.ius.edu.ba/sites/default/files/u1251/6._tree-traversals.pdf

### Challenge
    
    - Create a Node class that has properties for the value stored in the node, the left child node, and the right child
     node.
    - Create a Tree class:
      - Define a method for each of the depth first traversals called `preOrder`, `inOrder`, and `postOrder` which returns
        an array of the values, ordered appropriately.
    - At no time should an exception or stack trace be shown to the end user. Catch and handle any such exceptions and 
      return a printed value or operation which cleanly represents the state and either stops execution cleanly, or 
      provides the user with clear direction and output.
    - Create a BinarySearchTree class:
      - Define a method named add that accepts a value, and adds a new node with that value in the correct location in 
        the binary search tree.
      - Define a method named contains that accepts a value, and returns a boolean indicating whether or not the value 
        is in the tree at least once.
      

### Testing
    
    - Can successfully instantiate an empty tree
    - Can successfully instantiate a tree with a single root node
    - Can successfully add a left child and right child to a single root node
    - Can successfully return a collection from a preorder traversal
    - Can successfully return a collection from an inorder traversal
    - Can successfully return a collection from a postorder traversal
    
### Approach & Efficiency

contains method: O log(n) most cases and worst case O(n)
preOrder method: O(n) 
postOrder: O(n)
inOrder: O(n)

The approach that I took was reading online to do some more understanding of the binary search tree and the traversal
methods. 

### API's 

preOrder: root, left, right is the order in which the tree is traversed and returns the root data value when its is hit.
postOrder: left, right, root is the order in which the tree is traversed and returns the root data value when its is hit.
inOrder: left, root, right is the order in which the tree is traversed and returns the root data value when its is hit.
add: will add another node/leaf from the current location/leaf
addFromRoot: adds a new node/leaf from the root out
contains: determines whether a data value is present within the tree and returns a boolean value in response.
treeContains: navigates through the tree to find the data value and returns a boolean value in response.

 [Trees](../src/main/java/Tree/BinarySearchTree.java)
 [Trees](../src/main/java/Tree/BinaryTree.java)
