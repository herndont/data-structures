import LinkedList.LinkedList;
import org.junit.Assert;
import org.junit.Test;
import LinkedList.Node;
import sun.misc.ASCIICaseInsensitiveComparator;


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

    @Test
    public void appendTest() {

        LinkedList<Integer> list = new LinkedList<Integer>();
        list.insert(15);
        list.insert(16);
        list.append(17);

        //        Can successfully add a node to the end of the linked list

        Assert.assertEquals(17, list.head.next.next.data);

        //Can successfully add multiple nodes to the end of a linked list

        list.append(18);

        Assert.assertEquals(18, list.head.next.next.next.data);

        //Can successfully insert a node before a node located in the middle of a linked list

        list.insertBefore(17, 5);

        Assert.assertEquals(5, list.head.next.next.data);
    }

    @Test
    public void beforeTest() {
//        Can successfully insert a node before the first node of a linked list

        LinkedList<Integer> list = new LinkedList<Integer>();
        list.insert(15);
        list.insert(16);

        list.insertBefore(15, 5);
        Assert.assertEquals(5, list.head.next.data);

        list.insertBefore(5, 3);
        Assert.assertEquals(3, list.head.next.data);

        list.insertBefore(5, 2);
        Assert.assertEquals(2, list.head.next.next.data);
    }

    @Test
    public void afterTest() {
//  Can successfully insert after a node in the middle of the linked list
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.insert(15);
        list.insert(16);

        list.insertAfter(15, 5);
        Assert.assertEquals(5, list.head.next.next.data);

        list.insertAfter(16, 1);
        Assert.assertEquals(1, list.head.next.data);

        list.insertAfter(1, 8);
        Assert.assertEquals(8, list.head.next.next.data);
    }

    @Test
    public void afterLastTest(){
//  Can successfully insert a node after the last node of the linked list
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.insert(15);
        list.insert(16);

        list.insertAfter(15, 1);
        Assert.assertEquals(1, list.head.next.next.data);

        list.insertAfter(1, 2);
        Assert.assertEquals(2, list.head.next.next.next.data);

        list.insertAfter(2, 3);
        Assert.assertEquals(3, list.head.next.next.next.next.data);
    }



}