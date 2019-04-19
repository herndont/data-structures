import org.junit.Assert;
import org.junit.Test;


public class BinarySearchTest {
    @Test
    public void binarySearch_happyPath() {
         // Arrange
        final int expected = 2;
        final int[] array1= {4, 8, 15, 16, 23, 42};
         // Act
        final int actual = BinarySearch.BinarySearch(15, array1);

         // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void binarySearch_expectedFailure() {
        // Arrange
        final int expected = -1;
        final int[] array1= {11, 22, 33, 44, 55, 66, 77};
        // Act
        final int actual = BinarySearch.BinarySearch(90, array1);

        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void binarySearch_edgeCase() {
        // Arrange
        final int expected = -1;
        final int[] array1= {};
        // Act
        final int actual = BinarySearch.BinarySearch(90, array1);

        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void binarySearch_muchoNumero() {
        // Arrange
        final int expected = 90;
        final int array1[] = new int[100];
        for (int i=0; i<array1.length; i++) {
            array1[i] = i;
        }
        // Act
        final int actual = BinarySearch.BinarySearch(90, array1);

        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void binarySearch_muchoNumero2() {
        // Arrange
        final int expected = -1;
        final int array1[] = new int[10000];
        for (int i=0; i<array1.length; i++) {
            array1[i] = i;
        }
        // Act
        final int actual = BinarySearch.BinarySearch(11000, array1);

        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void binarySearch_muchoNumero3() {
        // Arrange
        final int expected = 10000;
        final int array1[] = new int[100000];
        for (int i=0; i<array1.length; i++) {
            array1[i] = i;
        }
        // Act
        final int actual = BinarySearch.BinarySearch(10000, array1);

        // Assert
        Assert.assertEquals(expected, actual);
    }

}