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
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.insert(15);
        list.insert(10);
        list.insert(5);


        // Assert
        Assert.assertEquals(15, list.head.data);
    }

    @Test
    public void truthyIncludes() {
        //Arrange
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.insert(15);
        list.insert(16);
        list.insert(17);

        boolean expected = true;
        boolean actual = list.includes(15);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void falsyIncludes() {
        //arrange
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.insert(15);
        list.insert(16);
        list.insert(17);

        boolean expected = false;
        boolean actual = list.includes(14);

        Assert.assertEquals(expected, actual);
    }
//    Still need the test for the printing the collection from lab05
//    @Test
//    public void

//------------------ Everything below is from Challenge 06

    // Need to write tests for Challenge 06



}