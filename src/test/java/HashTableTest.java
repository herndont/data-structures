import org.junit.Assert;
import org.junit.Test;
import HashTable.HashTable;

import static org.junit.Assert.*;

public class HashTableTest {

    @Test
    public void add() {
//        can properly add a key value pair to the hashtable
//        Adding a key/value to your hashtable results in the value being in the data structure
        HashTable hashTable = new HashTable();
        hashTable.add(1, "A");
        hashTable.add(2, "B");
        hashTable.add(3, "C");

        Assert.assertEquals("A", hashTable.get(1));
        Assert.assertEquals("B", hashTable.get(2));
        Assert.assertEquals("C", hashTable.get(3));
    }

    @Test
    public void get() {
//        Can properly use the get method to return the value associated with a specific key
//        Retrieving based on a key returns the value stored
//        Successfully returns null for a key that does not exist in the hashtable

        HashTable hashTable = new HashTable();
        hashTable.add(1, "A");
        hashTable.add(2, "B");
        hashTable.add(3, "C");

        Assert.assertEquals("A", hashTable.get(1));
        Assert.assertEquals("B", hashTable.get(2));
        Assert.assertEquals(null, hashTable.get(4));
    }

    @Test
    public void contains() {
//        Can properly use the contains method to give a true or false answer based on whether the table holds a specific key
        HashTable hashTable = new HashTable();
        hashTable.add(1, "A");
        hashTable.add(2, "B");
        hashTable.add(3, "C");

    Assert.assertEquals(false, hashTable.contains(4));
//    Assert.assertEquals();
    }

    @Test
    public void hash() {
    }
}