import LinkedList.LinkedList;
import LinkedList.Node;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;
import sun.misc.ASCIICaseInsensitiveComparator;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class LinkedListTest {

//-----------------Lab 05 Tests--------------------------

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void constructorTest() {
        // Can successfully instantiate an empty linked list
        LinkedList list = new LinkedList();
            Assert.assertEquals(null, list.head);
    }

    @Test
    public void insertTest() {
        // Can properly insert into the linked list
//        Can properly insert multiple nodes into the linked list

        LinkedList<Integer> list = new LinkedList<Integer>();
        list.insert(15);
        list.insert(10);
        list.insert(5);

        // Assert
        Assert.assertEquals(5, list.head.data);
        Assert.assertEquals(10, list.head.next.data);
        Assert.assertEquals(15, list.head.next.next.data);
    }

    @Test
//    --------------------------------This printTest is still not working-----------------------
    public void printTest() {
//        Can properly return a collection of all the values that exist in the linked list

        LinkedList<Integer> list = new LinkedList<Integer>();
        list.insert(15);
        list.insert(16);

        list.print();
        Assert.assertEquals("16, 15, ", outContent.toString());

        list.insert(17);
        list.print();
        Assert.assertEquals("17, 16, 15, ", outContent.toString());

        list.insert(18);
        list.print();
        Assert.assertEquals("18, 17, 16, 15, ", outContent.toString());
    }

    @Test
    public void truthyIncludes() {
//        Will return true when finding a value within the linked list that exists

        LinkedList<Integer> list = new LinkedList<Integer>();
        list.insert(15);
        list.insert(16);
        list.insert(17);

        Assert.assertEquals(true, list.includes(15));
        Assert.assertEquals(true, list.includes(16));
        Assert.assertEquals(true, list.includes(17));
    }

    @Test
//    Will return false when searching for a value in the linked list that does not exist

    public void falsyIncludes() {
        //arrange
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.insert(15);
        list.insert(16);
        list.insert(17);

        boolean expected = false;
        boolean actual = list.includes(14);

        Assert.assertEquals(false, list.includes(14));
        Assert.assertEquals(false, list.includes(118));
        Assert.assertEquals(false, list.includes(18));

    }


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

//------------------ Everything below is from Challenge 07

    //Need to put 3 different asserts in each test at a minimum and have the linkedList constructor as a global variable
    //Use this constructor a couple of times above and use different names example: list, list1, list2
    @Test
    public void kGreaterLength() throws Exception {
        //arrange
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.insert(15);
        list.insert(16);
        list.insert(17);
        list.insert(18);

        Exception expected = new Exception();
        int actual = list.findValue(5);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void kSizeEqualTest() throws Exception {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.insert(15);
        list.insert(16);
        list.insert(17);
        list.insert(18);
        list.insert(19);
        list.insert(20);

        int expected = 20;
        int actual = list.findValue(5);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void negativeKTest() throws Exception {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.insert(15);
        list.insert(16);
        list.insert(17);

        Exception expected = new Exception();
        int actual = list.findValue(-5);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sizeOneListTest() throws Exception {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.insert(15);

        int expected = 15;
        int actual = list.findValue(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sizeOneListTest2() throws Exception {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.insert(15);

        Exception expected = new Exception();
        int actual = list.findValue(2);
        Assert.assertEquals(expected, actual);
    }

//    @Test
//    public void happyPathTest() throws Exception{
//        LinkedList<Integer> list = new LinkedList<Integer>();
//        list.insert(15);
//        list.insert(16);
//        list.insert(17);
//        list.insert(18);
//        list.insert(19);
//        list.insert(20);
//
//        int expected = 18;
//        int actual = list.findValue(2);
//        Assert.assertEquals(expected, actual);
//    }

    //------------------------ Code Challenge 08 Tests

    @Test
    public void happyPathTest()  {
        LinkedList<Integer> list1 = new LinkedList<Integer>();
            list1.insert(10);
            list1.insert(15);
            list1.insert(20);
        LinkedList<Integer> list2 = new LinkedList<Integer>();
            list2.insert(8);
            list2.insert(12);
            list2.insert(18);

            final Node actual = LinkedList.mergedLists(list1.head, list2.head);
            Assert.assertEquals(8, actual.data);
    }

//    @Test
//    public void expectedFailureTest() {
//        LinkedList<Integer> list1 = new LinkedList<Integer>();
//            list1.insert(10);
//            list1.insert(15);
//            list1.insert(20);
//        LinkedList<Integer> list2 = new LinkedList<Integer>();
//            list2.insert(8);
//            list2.insert(12);
//            list2.insert(18);
//
//        expected = ;
//        actual = ;
//
//        Assert.assertEquals();
//    }
//
//    @Test
//    public void edgeCaseTest() {
//        LinkedList<Integer> list1 = new LinkedList<Integer>();
//            list1.insert(10);
//            list1.insert(15);
//            list1.insert(20);
//        LinkedList<Integer> list2 = new LinkedList<Integer>();
//            list2.insert(8);
//            list2.insert(12);
//            list2.insert(18);
//
//        expected = ;
//        actual = ;
//
//        Assert.assertEquals();
//    }

}