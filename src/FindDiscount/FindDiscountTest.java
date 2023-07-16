package FindDiscount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindDiscountTest {

    /*
    Problem: Create a function that takes two arguments:
    the original price and the discount percentage as integers
    and returns the final price after the discount.
    Example: discount(1500, 50) → 750
            discount(89, 20) → 71.2
            discount(100, 75) → 25
     */

    @Test
    public void nothing(){}

    @Test
    public void givenEmpty_returnsZero() {
        Discount discount = new Discount();
        float finalPrice = discount.findDiscount(0, 0);
        assertEquals(0, finalPrice);
    }

    @Test
    public void givenNegativeNumber_returnsZero() {
        Discount discount = new Discount();
        float finalPrice = discount.findDiscount(-21, 20);
        assertEquals(0, finalPrice);
    }
}
