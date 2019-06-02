import QuickSort.QuickSort;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void quickSort() {
        int[] testArray = {4, 6, 2, 3, 5, 8, 1};


        QuickSort.sort(testArray, 0,testArray.length-1);

        int[] expected = {1, 2, 3, 4, 5, 6, 8};
        assertArrayEquals(expected, testArray);
    }
}