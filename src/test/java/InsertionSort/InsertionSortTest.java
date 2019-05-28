package InsertionSort;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;


public class InsertionSortTest {

    @Test
    public void  methodSortTest() {
        int[] testArray = new int[] {4, 5, 6, 2, 1, 20};

        int[] testOut = InsertionSort.sort(testArray);
        Arrays.sort(testArray);

        System.out.println(Arrays.toString(testArray));
        System.out.println(Arrays.toString(testOut));

        Assert.assertEquals(1, testOut[0]);
        Assert.assertEquals(20, testOut[5]);
    }

}