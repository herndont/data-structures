public class BinarySearch {
    public static void main(String[] args) {

        int x = 15;
        int y = 90;
        int[] array1 = {4, 8, 15, 16, 23, 42};
        int[] array2 = {11, 22, 33, 44, 55, 66, 77};

        BinarySearch(x, array1);
        BinarySearch(y, array2);

    }

    public static int BinarySearch(int value, int[] array) {

        int last = array.length - 1;
        int first = 0;
        int mid = (first + last) / 2;

        while (first <= last) {
            if (array[mid] < value) {
                first = mid + 1;
            } else if (array[mid] == value) {
                System.out.println(mid);
                return mid;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println(-1);
            return -1;
        }
        System.out.println(-1);
        return -1;
    }
}
