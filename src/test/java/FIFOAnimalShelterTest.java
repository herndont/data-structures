import AnimalShelter.FIFOAnimalShelter;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FIFOAnimalShelterTest {

    @Test
    public void enqueue() {
        //Happy Path

        //Can successfully enqueue onto a queue
        //Can successfully enqueue multiple items into a queue

        FIFOAnimalShelter testQ = new FIFOAnimalShelter();
        testQ.enqueue("dog");
        testQ.enqueue("cat");
        testQ.enqueue("cat");

        Assert.assertEquals("dog", testQ.front.data); //testing to make sure a node was added
        Assert.assertEquals("cat", testQ.front.next.data);  //testing to see if two node were added
        Assert.assertEquals("cat", testQ.front.next.next.data);   //testing to see if three nodes were added
    }


    @Test
    public void dequeue() {
        //Happy Path

        //Can successfully dequeue off of a queue
        //Can successfully dequeue multiple times

        FIFOAnimalShelter testQ = new FIFOAnimalShelter();
        testQ.enqueue("dog");
        testQ.enqueue("cat");
        testQ.enqueue("cat");
        testQ.enqueue("cat");


        Assert.assertEquals("dog", testQ.dequeue());
        Assert.assertEquals("cat", testQ.dequeue());
        Assert.assertEquals("cat", testQ.dequeue());
    }

    @Test
    public void expectFailure() {
        //Failure scenario

        //dequeue until there is nothing left and return null;

        FIFOAnimalShelter testQ = new FIFOAnimalShelter();
        testQ.enqueue("dog");

        Assert.assertEquals("dog", testQ.dequeue());
        Assert.assertEquals(null, testQ.dequeue());
        Assert.assertEquals(null, testQ.dequeue());
    }
}