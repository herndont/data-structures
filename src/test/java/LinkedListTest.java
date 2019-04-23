import LinkedList.LinkedList;
import org.junit.Assert;
import org.junit.Test;
import LinkedList.Node;


public class LinkedListTest {
    @Test
    public void constructorTest() {
        // Arrange
        LinkedList list = new LinkedList();
            Assert.assertEquals(null, list.head);
    }

    @Test
    public void insertTest() {
        // Arrange
        LinkedList list = new LinkedList();
        list.insert(new Node(15));
        // Assert
        Assert.assertEquals(, list.head.data);
    }

}