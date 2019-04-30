import org.junit.Assert;
import org.junit.Test;
import stacksandqueues.Stack;

public class StackTest {
     @Test
    public void pushTest() {
//         Can successfully push onto a stack
//         Can successfully push multiple nodes onto a stack
//         Can successfully pop off the stack
//         Can successfully empty a stack after multiple pops.



         Stack testStack = new Stack();
         testStack.push(15);
         testStack.push(16);
         testStack.push(17);

         Assert.assertEquals(17, testStack.top.data);
         Assert.assertEquals(16, testStack.top.next.data);
         Assert.assertEquals(15, testStack.top.next.next.data);
         Assert.assertEquals(17, testStack.pop());
         Assert.assertEquals(16, testStack.pop());
         Assert.assertEquals(15, testStack.pop());
     }
    @Test
     public void peekTest() {
//         Can successfully peek the next item on the stack.

         Stack testStack = new Stack();
         testStack.push(15);
         testStack.push(16);
         testStack.push(17);

         Assert.assertEquals(17, testStack.peek());
     }
}