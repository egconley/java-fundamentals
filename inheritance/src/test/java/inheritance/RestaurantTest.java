package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {

Restaurant test;

    @Before
    public void setUp() throws Exception {
        test = new Restaurant("Bob's", 3, 2);
    }

    @Test
    public void test_Restaurant_constructor() {
        //Restaurant test = new Restaurant("Bob's", 3, 2);
        assertEquals("Bob's", test.restaurantName);
        assertEquals(3, test.starScore);
        assertEquals(2, test.priceCategory);
    }

    @Test
    public void test_Restaurant_toString() {
        //Restaurant test = new Restaurant("Bob's", 3, 2);
        assertEquals("Bob's | 3 | 2", test.toString());
    }

    @Test
    public void test_Restaurant_addReview() {
        //Restaurant test = new Restaurant("Bob's", 3, 2);
        System.out.println("test = " + test);

        test.addReview(new RestaurantReview("Ellen", "Bob's", "Bob's is good.", 3));
        test.addReview(new RestaurantReview("Anna", "Bob's", "Bob's is gross.", 1));

        System.out.println("test = " + test);

        //System.out.println(test.restaurantReviews);
        //assertEquals("[Ellen gave Bob's 3 stars: Bob's is good., Anna gave Bob's 1 stars: Bob's is gross.]", test.restaurantReviews);
    }

    @Test
    public void test_Restaurant_addRestaurantReview() {
        test.addRestaurantReview("Ellen", "Bob's", "Super good!", 5);
        test.addRestaurantReview("Mindy", "Bob's", "Not so good", 4);

        assertEquals("Expecting 2 stars from this test.", "something", test.toString());
    }

}