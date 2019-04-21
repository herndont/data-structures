import java.util.Arrays;


public class Array_Reverse {

        public static void main(String[] args){
            int [] originalArray = {
                    1, 2, 3, 4, 5, 6};
            int [] array2 = {
                    89, 2354, 3546, 23, 10, -923, 823, -12
            };
            int [] array3 = {
                    2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101,
                    103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199
            };
            reverseArray(originalArray);
            reverseArray(array2);
            reverseArray(array3);
        }
        public static int[] reverseArray(int[] originalArray){
            int temp;
            for (int i=0; i<originalArray.length/2; i++){
                temp = originalArray[i];
                originalArray[i] = originalArray[originalArray.length-i-1];
                originalArray[originalArray.length-i-1]=temp;
            }
            System.out.println(Arrays.toString(originalArray));
            return originalArray;
        }
    }

