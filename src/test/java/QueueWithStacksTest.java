import QueueWithStacks.QueueWithStacks;
import org.junit.Assert;
import org.junit.Test;

public class QueueWithStacksTest {

    @Test
    public void enqueueTest() throws Exception {
//  Happy Path Test
        QueueWithStacks testQ = new QueueWithStacks();
        testQ.enqueue(15);
        testQ.enqueue(16);
        testQ.enqueue(17);

        Assert.assertEquals(15, testQ.dequeue());
        Assert.assertEquals(16, testQ.dequeue());

        testQ.enqueue(20);
        Assert.assertEquals(17, testQ.dequeue());
    }

    @Test(expected = Exception.class)
    public void dequeueTest() throws Exception {
//  Expected Failure
        QueueWithStacks testQ = new QueueWithStacks();

        testQ.enqueue(20);
        Assert.assertEquals(20, testQ.dequeue());
        testQ.enqueue(15);
        Assert.assertEquals(15, testQ.dequeue());
        testQ.dequeue();

    }
}
