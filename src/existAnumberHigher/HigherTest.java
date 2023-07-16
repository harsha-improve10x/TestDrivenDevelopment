package existAnumberHigher;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HigherTest {
    private Higher higher;
    /*
    Problem: Write a function that returns true
    if there exists at least one number that is larger than or equal to n.
    Example: existsHigher([5, 3, 15, 22, 4], 10) ➞ true
             existsHigher([1, 2, 3, 4, 5], 8) ➞ false
             existsHigher([4, 3, 3, 3, 2, 2, 2], 4) ➞ true
             existsHigher([], 5) ➞ false
     */

    @Test
    public void nothing(){}

    @BeforeEach
    public void setup(){
        higher = new Higher();
    }

    @Test
    public void givenEmptyArrayWith0_returnFalse() {
        boolean result = higher.existsHigher(new int[]{}, 0);
        assertEquals(false, result);
    }

    @Test
    public void givenNegativeArrayWith0_returnsTrue() {
        boolean result = higher.existsHigher(new int[]{-21, -32}, 0);
        assertEquals(false, result);
    }

    @Test
    public void givenNumbers_returnTrue() {
        boolean result = higher.existsHigher(new int[]{5, 3, 15, 22, 4}, 10);
        assertEquals(true, result);
    }

    @Test
    public void givenNumbersWithFour_returnTrue() {
        boolean result = higher.existsHigher(new int[]{1, 2, 3, 4, 5}, 8);
        assertEquals(false, result);
    }

    @Test
    public void givenNumbersWithOneEqual_returnTrue() {
        boolean result = higher.existsHigher(new int[]{4, 3, 3, 3, 2, 2, 2}, 4);
        assertEquals(true, result);
    }
}
