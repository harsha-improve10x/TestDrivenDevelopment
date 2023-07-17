package EqualityOfThreeValues;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class EqualityOfThreeValuesTest {

    /*
    Problem:    Create a function that takes three integer arguments(a, b, c)
                and returns the number of integers that are equal to value.
    Examples:   equal(3, 4, 3) ➞ 2
                equal(1, 1, 1) ➞ 3
                equal(3, 4, 1) ➞ 0
     */

    @Test
    public void nothing() {}

    @Test
    public void givenNegativeNumbers_returnZero() {
        Equality equality = new Equality();
        int result = equality.equal(-2, 1, 0);
        assertEquals(0, result);
    }
}
