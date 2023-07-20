package MissingNumber;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingNumberTest {
    private MissingNumber missingNumber;

    /*
    Problem:    Create a method that takes an array of integers between 1 and 10
                (excluding one number) and returns the missing number.
    Example:    missingNum([1, 2, 3, 4, 6, 7, 8, 9, 10]) ➞ 5
                missingNum([7, 2, 3, 6, 5, 9, 1, 4, 8]) ➞ 10
                missingNum([10, 5, 1, 2, 4, 6, 8, 3, 9]) ➞ 7
     */

    @Test
    public void nothing() {}

    @BeforeEach
    public void setup() {
        missingNumber = new MissingNumber();
    }

    @Test
    public void givenEmpty_returnZero() {
        int result = missingNumber.findMissingNumber(new int[]{});
        assertEquals(0, result);
    }

    @Test
    public void givenNegativeNumbers_returnMinusOne() {
        int result = missingNumber.findMissingNumber(new int[]{-2});
        assertEquals(-1, result);
    }

    @Test
    public void givenOneNumber_returnZero() {
        int result = missingNumber.findMissingNumber(new int[]{1});
        assertEquals(0, result);
    }

    @Test
    public void givenNumbers_returnZero() {
        int result = missingNumber.findMissingNumber(new int[]{1, 3, 4, 2, 7, 6, 9, 8});
        assertEquals(5, result);
    }

    @Test
    public void givenNumbers_returnTen() {
        int result = missingNumber.findMissingNumber(new int[]{3, 4, 2, 7, 6, 9, 8, 5});
        assertEquals(1, result);
    }

    @Test
    public void givenNumbers_returnSeven() {
        int result = missingNumber.findMissingNumber(new int[]{10, 5, 1, 2, 4, 6, 8, 3, 9});
        assertEquals(7, result);
    }
}
