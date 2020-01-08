package basiclibrary;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RollTest {
    @Test
    public void insertShiftArray() {
        Roll test1 = new Roll();
        //Roll test2 = new Roll();

        int input1 = 10;
        int[] expected1 = new int[10];
        boolean expectedLength1 = (expected1.length == input1);

        int[] result1 = test1.roll(input1);
        boolean expectedResultLength1 = (result1.length == input1);
        boolean isSameLength = expectedLength1 == expectedResultLength1;
        Assert.assertTrue(isSameLength);

        // could also check the range
    }
}