
# Merge Two Linked Lists
I paired with Jess on this challenge in class.

    This challenge requires that you take two Linked Lists and merge them together in a zipper fashion similar to that
    shown in the visual on the white boarding excercise pitcure link below. This merge is to be done without taking 
    extra space so there is no need to create a new Linked List, but only to merge the two together to form a new one.
    
    * Sources that we used to take inspiration and draw from code base was from the following website
     https://stackoverflow.com/questions/10707352/interview-merging-two-sorted-singly-linked-list


### Challenge
    - Write a function called mergeLists which takes two linked lists as arguments. 
    - Zip the two linked lists together into one so that the nodes alternate between the two lists and return a 
    reference to the head of the zipped list. 
    -Try and keep additional space down to O(1). You have access to the Node class and all the properties on the Linked 
    List class as well as the methods created in previous challenges.
    
### Approach & Efficiency

    Jess and I approached this challenge by using a while loop and comparing each individual node in order against the
    other in the same place on the corresponding Linked List. First we compared them to see if either of them was empty
    of a value. If the first node from Linked List A was null and the first node from Linked List B was not then we
    would add the first node from Linked List A. Then we would continue down the list. Then we went through and checked
    the nodes against each other for data size and did the same. Lastly we just checked to make sure that the node were
    not null and arranged them the same way. This we think, will create a sort of zipper merger for the nodes from 
    the two lists creating a single list from nodes from the two original linked lists.   

### Solution
#### (White Board Solution)
![image](../assets/ll_kth_from_end.jpg)

