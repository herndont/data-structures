package MergeSort;


import java.util.Arrays;

public class MergeSort {

//    taken from Baeldung, still walking through the code and trying to understand it.
    public static int[] mergeSort(int[] in) {
        int[] out = new int[in.length];

        if (in.length > 1) {
            out = merge(Arrays.copyOfRange(in, 0, in.length / 2), Arrays.copyOfRange(in, in.length / 2, in.length));
            return out;
        }
        return in;
    }
    public static int[] merge(int[] a, int[] b){
        if (a.length > 1) {
            a = merge(Arrays.copyOfRange(a, 0, a.length / 2), Arrays.copyOfRange(a, a.length / 2, a.length));
        }
        if (b.length > 1) {
            b = merge(Arrays.copyOfRange(b, 0, b.length / 2), Arrays.copyOfRange(b, b.length/2,b.length));
        }
        int indexA = 0;
        int indexB = 0;

        int[] out = new int[a.length + b.length];

        for (int i = 0; i < out.length; i++) {
            if (indexA >= a.length) {
                out[i] = b[indexB];
                indexB++;
            } else if (indexB >= b.length) {
                out[i] = a[indexA];
                indexA++;
            } else if (a[indexA] < b[indexB]) {
                out[i] = a[indexA];
                indexA++;
            } else {
                out[i] = b[indexB];
                indexB++;
            }
        }
        return out;
    }
}


