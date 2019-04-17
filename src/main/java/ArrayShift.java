import java.util.Arrays;

public class ArrayShift {
        public static void main(String[] args){
            int x = 5;
            int y = 16;
            int z = 24;
            int[] array1 = {4, 8, 15, 23, 42};
            int[] array2 = {5, 6, 7, 8, 9, 11};
            int[] array = {2, 4, 6, 8};
            insertShiftArray(array, x);
            insertShiftArray(array1, y);
            insertShiftArray(array2, z);

        }
        public static int[] insertShiftArray(int[] array, int value) {
            int[] newArray = new int[array.length+1];
            for (int i = 0; i < array.length/2; i++) {
                newArray[i] = array[i];
            }
            newArray[array.length/2] = value;

            for (int j = array.length/2; j < array.length; j++) {
                newArray[j+1] = array[j];
            }
            System.out.println(Arrays.toString(newArray));
            return newArray;
        }
    }

