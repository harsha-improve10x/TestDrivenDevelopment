package Easy;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class MaximumConsecutiveOnesTest {

    @Test
    public void nothing() {}

    @Test
    public void givenNull_returnZero() {
        MaximumConsecutiveOne maximumConsecutiveOne = new MaximumConsecutiveOne();
        int result = maximumConsecutiveOne.maximum(null);
        assertEquals(0, result);
    }

}
