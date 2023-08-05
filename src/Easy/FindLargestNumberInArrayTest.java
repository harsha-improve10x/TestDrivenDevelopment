package Easy;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class FindLargestNumberInArrayTest {

    @Test
    public void nothing() {}

    @Test
    public void givenNull_returnZero() {
        LargestNumberArray largestNumberArray = new LargestNumberArray();
        int result = largestNumberArray.findLargest(null);
        assertEquals(0, result);
    }
}
