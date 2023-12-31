package Easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TwoSumTest {
    private TwoSum twoSum;

    @Test
    public void nothing() {}

    @BeforeEach
    public void setup() {
        twoSum = new TwoSum();
    }

    @Test
    public void givenNull_targetZero_return() {
        String result = twoSum.findSum(null, 0);
        assertEquals("No", result);
    }

    @Test
    public void givenEmpty_targetZero_return() {
        String result = twoSum.findSum(new int[]{}, 0);
        assertEquals("No", result);
    }

    @Test
    public void givenOne_targetOne_returnYes() {
        String result = twoSum.findSum(new int[]{1}, 1);
        assertEquals("Yes", result);
    }

    @Test
    public void givenOne_targetTwo_returnNo() {
        String result = twoSum.findSum(new int[]{1}, 2);
        assertEquals("No", result);
    }

    @Test
    public void givenOneTwo_targetThree_returnYes() {
        String result = twoSum.findSum(new int[]{1, 2}, 3);
        assertEquals("Yes", result);
    }

    @Test
    public void givenOneTwo_targetFour_returnNo() {
        String result = twoSum.findSum(new int[]{1, 2}, 4);
        assertEquals("No", result);
    }

    @Test
    public void givenOneTwoThree_targetFive_returnYes() {
        String result = twoSum.findSum(new int[]{1, 2, 3}, 5);
        assertEquals("Yes", result);
    }

    @Test
    public void givenOneTwoThree_targetSeven_returnYes() {
        String result = twoSum.findSum(new int[]{1, 2, 3}, 7);
        assertEquals("No", result);
    }

    @Test
    public void givenTwoSixFiveEightEleven_targetFourteen_returnYes() {
        String result = twoSum.findSum(new int[]{2, 6, 5, 8, 11}, 14);
        assertEquals("Yes", result);
    }

    @Test
    public void givenTwoSixFiveEightEleven_targetFifteen_returnNo() {
        String result = twoSum.findSum(new int[]{2, 6, 5, 8, 11}, 15);
        assertEquals("No", result);
    }
}
