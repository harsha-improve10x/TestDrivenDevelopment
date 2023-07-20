package LargestNumberInAnArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestNumberTest {

    @Test
    public void nothing() {}

    @Test
    public void givenEmpty_returnZero() {
        LargestNumber largestNumber = new LargestNumber();
        int result = largestNumber.findLargestNumber(new int[]{});
        assertEquals(0, result);
    }
}
