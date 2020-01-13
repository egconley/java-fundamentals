package basiclibrary;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AveragesTest {
    @Test
    public void testAverages() {
        Averages test1 = new Averages();

        int[] testArray = new int[] {1,2,3,4};

        double expected = 2.5;
        double actual = Averages.arrayAverage(testArray);

        assertEquals(expected, actual, 0.000001);
    }
}