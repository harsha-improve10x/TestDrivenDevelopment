package IntegerInRange;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerInRangeTest {
    private IntegerInRange integerInRange;
    /*
    Problem:Write a function that validates whether a number n is within the lower and upper bounds.
            Return true if so, false otherwise.
    Example:intWithinBounds(3, 1, 9) ➞ true
            intWithinBounds(6, 1, 6) ➞ false
            intWithinBounds(3, 3, 8) ➞ true
     */

    @Test
    public void nothing() {}

    @BeforeEach
    public void setup() {
        integerInRange = new IntegerInRange();
    }

    @Test
    public void givenEmpty_return0() {
        boolean result = integerInRange.intWithinBounds(0,0,0);
        assertEquals(false, result);
    }

    @Test
    public void givenThreeOneNine_returnTrue() {
        boolean result = integerInRange.intWithinBounds(3,1,9);
        assertEquals(true, result);
    }

    @Test
    public void givenSixOneSix_returnFalse() {
        boolean result = integerInRange.intWithinBounds(6, 1, 6);
        assertEquals(false, result);
    }

    @Test
    public void givenOneOneOne_returnFalse() {
        boolean result = integerInRange.intWithinBounds(1, 1, 1);
        assertEquals(false, result);
    }
}
