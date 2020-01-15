package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    @Test
    public void test_Shop_toString() {
        Shop test = new Shop("Cool Shop", "Cool shop sells cool stuff.", 2);
        assertEquals("Cool Shop | Cool shop sells cool stuff. | 2", test.toString());
    }
}