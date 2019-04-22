
# Linked List

    This challenge is for the creation of a linked list. Up until this point we have been using arrays for everything
    and now this challenge will utilize the list formatting. The user must be able to add node and navigate through the
    list.

### Challenge
    
    - Create a Node class that has properties for the value stored in the Node, and a pointer to the next Node.
    - Within your LinkedList class, include a head property. Upon instantiation, an empty Linked List should be created.
        - This object should be aware of a default empty value assigned to head when the linked list is instantiated.
        - Define a method called insert which takes any value as an argument and adds a new node with that value 
          to the head of the list with an O(1) Time performance.
        - Define a method called includes which takes any value as an argument and returns a boolean result depending 
          on whether that value exists as a Node’s value somewhere within the list.
        - Define a method called print which takes in no arguments and returns a collection all of the current Node 
          values in the Linked List.
   
    - At no time should an exception or stack trace be shown to the end user. Catch and handle any such exceptions and
     return a printed value or operation which cleanly represents the state and either stops execution cleanly, or provides the user with clear direction and output.
    - Be sure to follow your language/frameworks standard naming conventions (e.g. C# uses PascalCasing for all method
     and class names).

### Approach & Efficiency

    Approach: This is no where near complete so this section will be updated once there is something to state.
    
    Efficiency: Write tests to prove the following functionality.
        - Can successfully instantiate an empty linked list
        -  Can properly insert into the linked list
        -  The head property will properly point to the first node in the linked list
        -  Can properly insert multiple nodes into the linked list
        -  Will return true when finding a value within the linked list that exists
        -  Will return false when searching for a value in the linked list that does not exist
        -  Can properly return a collection of all the values that exist in the linked list
    * Ensure your tests are passing before you submit your solution.
      
    BigO Space and Time:      



