## Hash Table

### Challenge
    - Implement a Hash Table with the following methods.
        -add: takes in both the key and value. This method should hash the key, and add the key and value pair to the 
         table, handling collisions as needed.
        -get: takes in the key and returns the value from the table.
        -contains: takes in the key and returns a boolean, indicating if the key exists in the table already.
        -hash: takes in an arbitrary key and returns an index in the collection.


### Testing

    Write tests to prove the following functionality:
        -Adding a key/value to your hashtable results in the value being in the data structure
        -Retrieving based on a key returns the value stored
        -Successfully returns null for a key that does not exist in the hashtable
        -Successfully handle a collision within the hashtable
        -Successfully retrieve a value from a bucket within the hashtable that has a collision
        -Successfully hash a key to an in-range value
    
   
### Approach & Efficiency
    I approached this lab by doing research online and looking over the demo from class.
    The websites that I read and took inspiration from are the following.
            https://beginnersbook.com/2014/07/hashtable-in-java-with-example/
            https://howtodoinjava.com/java/collections/hashtable-class/
            https://www.geeksforgeeks.org/hashtable-put-method-in-java/
            https://www.geeksforgeeks.org/hashtable-in-java/

### API

Add method: Takes in a key and value pair and adds them to the Table. More logic around collisions needs to be added.
Get method: Takes in a key and returns the value associated with that specific key.
Contains method: Takes in a key and returns a boolean whether or not it is in the table
Hash method: Take in a key and modulas the key by the size of the table. This then gives you back the index.

 
 
 [Hash Table Code](../src/main/java/HashTable/HashTable.java)
 
  [Hash Table Tests](../src/test/java/HashTableTest.java)