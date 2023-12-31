package Easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class FindLargestNumberInArrayTest {
    private LargestNumberArray largestNumberArray;

    @Test
    public void nothing() {}

    @BeforeEach
    public void setup() {
        largestNumberArray = new LargestNumberArray();
    }

    @Test
    public void givenNull_returnZero() {
        int result = largestNumberArray.findLargest(null);
        assertEquals(0, result);
    }

    @Test
    public void givenEmpty_returnZero() {
        int result = largestNumberArray.findLargest(new int[]{});
        assertEquals(0, result);
    }

    @Test
    public void givenZero_returnZero() {
        int result = largestNumberArray.findLargest(new int[]{0});
        assertEquals(0, result);
    }

    @Test
    public void givenOne_returnOne() {
        int result = largestNumberArray.findLargest(new int[]{1});
        assertEquals(1, result);
    }

    @Test
    public void givenOneTwo_returnTwo() {
        int result = largestNumberArray.findLargest(new int[]{1, 2});
        assertEquals(2, result);
    }

    @Test
    public void givenOneTwoThree_returnThree() {
        int result = largestNumberArray.findLargest(new int[]{1, 2, 3});
        assertEquals(3, result);
    }

    @Test
    public void givenFourOneTwoThree_returnFour() {
        int result = largestNumberArray.findLargest(new int[]{4, 1, 2, 3});
        assertEquals(4, result);
    }

    @Test
    public void givenMinusFourMinusOneMinusTwoMinusThree_returnMinusOne() {
        int result = largestNumberArray.findLargest(new int[]{-4, -1, -2, -3});
        assertEquals(-1, result);
    }
}
