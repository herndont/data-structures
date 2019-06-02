import MergeSort.MergeSort;
import com.sun.scenario.effect.Merge;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void mergeSort() {
        int[] in = {4, 1, 5, 2, 8, 9};
        int[] out = MergeSort.mergeSort(in);
        Arrays.sort(in);

        assertArrayEquals(in, out);
    }
}