package basiclibrary;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrayOfArraysTest {

    @Test
    public void test_lowestArrayAverage() {
        ArrayOfArrays test1 = new ArrayOfArrays();

        int[][] testArray = new int[][]{
                {1, 2, 3},
                {34, 45, 67},
                {-3, -5, 10}
        };

        int[] expected = new int[] {-3, -5, 10};

        int[] actual = ArrayOfArrays.lowestArrayAverage(testArray);

        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

}