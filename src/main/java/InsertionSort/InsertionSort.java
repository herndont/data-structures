package InsertionSort;

//Examples taken from Geeks for Geeks and JavaTPoint
public class InsertionSort {
    public static int[] sort(int[] arr) {
        if (arr == null) {
            return null;
        }
        int[] array = arr.clone();
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i -1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        return array;
    }
}
