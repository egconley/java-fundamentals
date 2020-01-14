package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {

Restaurant test;

    @Before
    public void setUp() throws Exception {
        Restaurant test = new Restaurant("Bob's", 3, "$$");
    }

    @Test
    public void test_Restaurant_constructor() {
        Restaurant test = new Restaurant("Bob's", 3, "$$");
        assertEquals("Bob's", test.restaurantName);
        assertEquals(3, test.starScore);
        assertEquals("$$", test.priceCategory);
    }

    @Test
    public void test_Restaurant_toString() {
        Restaurant test = new Restaurant("Bob's", 3, "$$");
        assertEquals("Bob's | 3 | $$", test.toString());
    }
}