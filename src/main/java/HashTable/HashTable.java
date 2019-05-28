package HashTable;


import java.util.Hashtable;

public class HashTable {
//    Creation of Hash Table
    Hashtable<Integer, String> hashTable = new Hashtable<>();

//    Creation of add method which take a key and value pair and adds them to the hashtable
    public void add(int key, String value) {
//        going to need to add some logic here for collisions but still not sure how.
        hashTable.put(key, value);
    }

//    Creation of get method which takes a key and returns the value associated with that key
    public String get(int key) {
        String val = hashTable.get(key);
        return val;
    }

//    Creation of contains method that takes in a key and returns a boolean indicating whether or not the value is present
    public boolean contains(int key) {
        boolean htKey = hashTable.containsKey(key);
        if(htKey) {
            return true;
        }
        else return false;
    }

//    Creation of hash method that takes in a key and returns the index in the collection
    public int hash(int key) {
        if(hashTable.containsKey(key) == false) {
            return 0000;
        }
        int index = key % hashTable.size();

        return index;
    }
}
