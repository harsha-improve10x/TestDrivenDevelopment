package Easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class MaximumConsecutiveOnesTest {
    private  MaximumConsecutiveOne maximumConsecutiveOne;
    @Test
    public void nothing() {}

    @BeforeEach
    public void setup() {
        maximumConsecutiveOne = new MaximumConsecutiveOne();
    }

    @Test
    public void givenNull_returnZero() {
        int result = maximumConsecutiveOne.maximum(null);
        assertEquals(0, result);
    }

    @Test
    public void givenEmpty_returnZero() {
        int result = maximumConsecutiveOne.maximum(new int[]{});
        assertEquals(0, result);
    }

    @Test
    public void givenOne_returnOne() {
        int result = maximumConsecutiveOne.maximum(new int[]{1});
        assertEquals(1, result);
    }

    @Test
    public void givenOneOneTwo_returnTwo() {
        int result = maximumConsecutiveOne.maximum(new int[]{1, 1, 2});
        assertEquals(2, result);
    }

    @Test
    public void givenOneZeroOneOneZero_returnTwo() {
        int result = maximumConsecutiveOne.maximum(new int[]{1, 0, 1, 1, 0});
        assertEquals(2, result);
    }
}
