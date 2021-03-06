package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testToString() {
        Review test = new RestaurantReview("Mandy Moore", "Bob's", "Bob's has good burgers.", 5);

        String expected = "Mandy Moore gave Bob's 5 stars: Bob's has good burgers.";
        String actual = test.toString();

        assertEquals(expected, actual);
    }
}