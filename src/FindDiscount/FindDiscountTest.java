package FindDiscount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindDiscountTest {
    private Discount discount;
    /*
    Problem: Create a function that takes two arguments:
    the original price and the discount percentage as integers
    and returns the final price after the discount.
    Example: discount(1500, 50) → 750
            discount(89, 20) → 17.0
            discount(100, 75) → 25
     */

    @Test
    public void nothing(){}

    @BeforeEach
    public void setup() {
        discount = new Discount();
    }

    @Test
    public void givenEmpty_returnsZero() {
        float finalPrice = discount.findDiscount(0, 0);
        assertEquals(0, finalPrice);
    }

    @Test
    public void givenNegativeNumber_returnsZero() {
        float finalPrice = discount.findDiscount(-21, 20);
        assertEquals(0, finalPrice);
    }

    @Test
    public void givenThousandFiveHundredAndFifty_returnsSevenFifty() {
        float finalPrice = discount.findDiscount(1500, 50);
        assertEquals(750, finalPrice);
    }

    @Test
    public void givenEightyNineAndTwenty_returnsSeventyOnePointTwo() {
        float finalPrice = discount.findDiscount(89, 20);
        assertEquals(17.0, finalPrice);
    }
}
