import org.junit.Assert;
import org.junit.Test;
import stacksandqueues.Queue;


public class QueueTest {

    @Test
    public void enqueueTest() {
        //Can successfully enqueue onto a queue
        //Can successfully enqueue multiple items into a queue

        Queue testQ = new Queue();
        testQ.enqueue(15);
        testQ.enqueue(16);
        testQ.enqueue(17);

        Assert.assertEquals(15, testQ.front.data); //testing to make sure a node was added
        Assert.assertEquals(16, testQ.front.next.data);  //testing to see if two node were added
        Assert.assertEquals(17, testQ.front.next.next.data);   //testing to see if three nodes were added
    }

    @Test
    public void dequeueTest() {
        //    Can successfully dequeue off of a queue the expected value
//        Can successfully peek into a queue, seeing the expected value
//        Can successfully empty a queue after multiple dequeues


        Queue testQ = new Queue();
        testQ.enqueue(15);
        testQ.enqueue(16);
        testQ.enqueue(17);

        Assert.assertEquals(15, testQ.dequeue());
        Assert.assertEquals(16, testQ.dequeue());
        Assert.assertEquals(17, testQ.peek());
        Assert.assertEquals(17, testQ.dequeue());
    }

}
