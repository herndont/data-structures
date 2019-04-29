
# Stacks and Queues
## Lab 10

## Challenge
    * Create a `Node` class that has properties for the value stored in the Node, and a pointer to the next node.
    * Create a `Stack` class that has a top property. It creates an empty Stack when instantiated.
        * This object should be aware of a default empty value assigned to `top` when the stack is created.
        * Define a method called `push` which takes any value as an argument and adds a new node with that value to the 
          `top` of the stack with an O(1) Time performance.
        * Define a method called `pop` that does not take any argument, removes the node from the top of the stack, and 
          returns the node’s value.
        * Define a method called `peek` that does not take an argument and returns the value of the node located on the 
          `top` of the stack.
    * Create a `Queue` class that has a top property. It creates an empty queue when instantiated.
        * This object should be aware of a default empty value assigned to front when the queue is created.
        * Define a method called enqueue which takes any value as an argument and adds a new node with that value to the back of the queue with an O(1) Time performance.
        * Define a method called dequeue that does not take any argument, removes the node from the front of the queue, and returns the node’s value.
        * Define a method called peek that does not take an argument and returns the value of the node located in the front of the stack.
    * At no time should an exception or stack trace be shown to the end user. Catch and handle any such exceptions and return a printed value or operation which cleanly represents the state and either stops execution cleanly, or provides the user with clear direction and output.
    * Be sure to follow your languages best practices for naming conventions.

## Testing

    1. Can successfully push onto a stack
    2. Can successfully push multiple nodes onto a stack
    3. Can successfully pop off the stack
    4. Can successfully empty a stack after multiple pops.
    5. Can successfully peek the next item on the stack.
    6. Can successfully instantiate an empty stack
    7. Can successfully enqueue onto a queue
    8. Can successfully enqueue multiple items into a queue
    9. Can successfully dequeue off of a queue the expected value
    10. Can successfully peek into a queue, seeing the expected value
    11. Can successfully empty a queue after multiple dequeues
    12. Can successfully instantiate an empty queue

    Ensure your tests are passing before you submit your solution.


## Approach & Efficiency


## API
    Description of each methods publicly available to your Stack and Queue

