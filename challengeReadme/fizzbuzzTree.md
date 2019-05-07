
# Implement a Binary Tree and a BST
### Lab 16
    This challenge was harder for me than expected. I had a hard time finding any reference online to traversing a tree
    that wasn't binary. I know that a lot of this material was covered in class, but it was completed in pseudo code on
    the white board that wasn't in front of the camera that was recording. 
    
    I knew that the Node class was going to be different because there would need to be the potential for multiple child 
    node available to one parent and therefore, preOrder, postOrder, and inOrder methods that were utilized the previous
    day would no longer work because they were meant for binary trees. That is why I decided to use the breadth first 
    traversal method or BFT. This method spreads out accross the trees level and touches every single node within the
    tree, therefore allowing me to change the values of those nodes.


### Challenge
    - Write a function called `FizzBuzzTree` which takes a tree as an argument.
    - Without utilizing any of the built-in methods available to your language, determine weather or not the value of 
      each node is divisible by 3, 5 or both, and change the value of each of the nodes:
        - If the value is divisible by 3, replace the value with `“Fizz”`
        - If the value is divisible by 5, replace the value with `“Buzz”`
        - If the value is divisible by 3 and 5, replace the value with `“FizzBuzz”`
    - Return the tree with its new values.
    - For explicitly-typed languages: Ensure your node values are of type Object, to hold either strings or integers.




### Testing

    - “Happy Path” - Expected outcome
    - Expected failure
    - Edge Case (if applicable/obvious)
    
   
### Approach & Efficiency

FizzBuzzTree Method: O(n)<sup>2</sup> because of the while loop and the for loop nested.

My approach was to go online and look up some examples of traversing a tree that was non-binary and then using those 
examples to traverse through th tree touching all nodes within and hopefully changing their value.

### Solution

![white board](../assets/fizzBuzzTree.jpg)


 [FizzBuzzTree Node](../src/main/java/FizzBuzzTree/Node.java)
 
 
 [FizzBuzzTree Code](../src/main/java/FizzBuzzTree/FizzBuzzTree.java)

