package Easy;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class LongestSubArrayTest {

    @Test
    public void nothing() {}

    @Test
    public void givenNull_returnZero() {
        LongestSubArray longestSubArray = new LongestSubArray();
        int result = longestSubArray.findLongest(null, 0);
        assertEquals(0, result);
    }
}
