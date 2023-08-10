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
}