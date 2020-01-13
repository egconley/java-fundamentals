package basiclibrary;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContainsDuplicatesTest {
    @Test
    public void test_false_ContainsDuplicates() {
        ContainsDuplicates test1 = new ContainsDuplicates();

        int[] testArray = new int[] {1,2,3,4};

        assertFalse(ContainsDuplicates.containsDuplicates(testArray));
    }

    @Test
    public void test_true_ContainsDuplicates() {
        ContainsDuplicates test1 = new ContainsDuplicates();

        int[] testArray = new int[] {1,2,3,4,4};

        assertTrue(ContainsDuplicates.containsDuplicates(testArray));
    }

}