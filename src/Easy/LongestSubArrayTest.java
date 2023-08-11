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
}
