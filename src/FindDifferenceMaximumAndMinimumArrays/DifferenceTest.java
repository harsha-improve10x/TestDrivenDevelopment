package FindDifferenceMaximumAndMinimumArrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DifferenceTest {

    @Test
    public void nothing() {
    }
    /*
    Create a function that takes an array and returns the difference between the biggest and smallest numbers.
    example:-differenceMaxMin([10, 4, 1, 4, -10, -50, 32, 21]) ➞ 82
    Smallest number is -50, biggest is 32.

    differenceMaxMin([44, 32, 86, 19]) ➞ 67
    Smallest number is 19, biggest is 86.
     */

    @Test
    public void empty() {
        Difference difference = new Difference();
        int result = difference.findDiff(new int[]{});
        assertEquals(0,result);
    }

    @Test
    public void giveOneNumber_returnGivenNumber() {
        Difference difference = new Difference();
        int result = difference.findDiff(new int[]{9});
        assertEquals(9, result);
    }

    @Test
    public void giveTwoNumber_returnDifference() {
        Difference difference = new Difference();
        int result = difference.findDiff(new int[]{2, 3});
        assertEquals(1, result);
    }
}
