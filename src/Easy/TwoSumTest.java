package Easy;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TwoSumTest {

    @Test
    public void nothing() {}

    @Test
    public void givenNull_targetZero_return() {
        TwoSum twoSum = new TwoSum();
        String result = twoSum.findSum(null, 0);
        assertEquals("No", result);
    }
}
