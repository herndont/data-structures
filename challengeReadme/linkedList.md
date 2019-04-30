
# Linked List

    This challenge is for the creation of a linked list. Up until this point we have been using arrays for everything
    and now this challenge will utilize the list formatting. The user must be able to add nodes and navigate through the
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

### Testing
    
    Efficiency: Write tests to prove the following functionality.
        - Can successfully instantiate an empty linked list
        -  Can properly insert into the linked list
        -  The head property will properly point to the first node in the linked list
        -  Can properly insert multiple nodes into the linked list
        -  Will return true when finding a value within the linked list that exists
        -  Will return false when searching for a value in the linked list that does not exist
        -  Can properly return a collection of all the values that exist in the linked list
    * Ensure your tests are passing before you submit your solution.
      

    
### Approach & Efficiency

    It was pretty hard for me to understand the linked lists from the beginning. In theory, I understood how they
    worked, but didn't understand the code associated with them. I looked online for examples and honestly became even
    more confused because in every code example they were instantiating the linked list and not testing it. So I was
    also trying to create the linked list outside of my test which became a problem. Now I am starting to understand
    that the methods need to be plug and play dynamic and able to be taken from this lab and plugged into another
    application if needed. Therefore, I stopped trying to initialize a linked list inside of my code and only did it
    within the testing files.

## API's 
    (description of each method publicly available)
    
    * Insert: Insert adds a new node with pointer and value into the linked list. By doing this, we change the new head 
      to equal the new node and also have the pointer point then to the old head.
    * Includes: The includes method looks from one node and uses the pointer to travel all of the way through the entire
      linked list until it gets to a null pointer value. Once it reaches a null pointer value, it knows it has reached
      the end of the list and then returns a boolean whether or not the list inludes the data value which was entered.
    * Print: Print will print the values of all of the node in the list. It works in similar fashion to the includes,
      but instead of returning a boolean, it returns all of the linked list values in a string.


