package Easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class LongestSubArrayTest {
    private LongestSubArray longestSubArray;

    @Test
    public void nothing() {}

    @BeforeEach
    public void setup() {
        longestSubArray = new LongestSubArray();
    }

    @Test
    public void givenNull_returnZero() {
        int result = longestSubArray.findLongest(null, 0);
        assertEquals(0, result);
    }

    @Test
    public void givenEmpty_returnZero() {
        int result = longestSubArray.findLongest(new int[]{}, 0);
        assertEquals(0, result);
    }

    @Test
    public void givenOne_returnOne() {
        int result = longestSubArray.findLongest(new int[]{1}, 1);
        assertEquals(1, result);
    }

    @Test
    public void givenOneTwo_returnTwo() {
        int result = longestSubArray.findLongest(new int[]{1, 2}, 3);
        assertEquals(2, result);
    }

    @Test
    public void givenOneTwoThreeSeven_returnZero() {
        int result = longestSubArray.findLongest(new int[]{1, 2, 3}, 7);
        assertEquals(0, result);
    }

    @Test
    public void givenOneTwoThreeFiveFive_returnTwo() {
        int result = longestSubArray.findLongest(new int[]{1, 2, 3, 5}, 5);
        assertEquals(2, result);
    }
}
