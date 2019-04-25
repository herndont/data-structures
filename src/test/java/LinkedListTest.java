import LinkedList.LinkedList;
import LinkedList.Node;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

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