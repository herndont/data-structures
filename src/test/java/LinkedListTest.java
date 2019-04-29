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

    // Need to write tests for Challenge 06

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