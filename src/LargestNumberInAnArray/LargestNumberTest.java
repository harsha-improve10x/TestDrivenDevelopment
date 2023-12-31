package LargestNumberInAnArray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestNumberTest {
    private LargestNumber largestNumber;
    @Test
    public void nothing() {}

    @BeforeEach
    public void setup() {
        largestNumber = new LargestNumber();
    }

    @Test
    public void givenEmpty_returnZero() {
        int result = largestNumber.findLargestNumber(new int[]{});
        assertEquals(0, result);
    }

    @Test
    public void givenOne_returnOne() {
        int result = largestNumber.findLargestNumber(new int[]{1});
        assertEquals(1, result);
    }

    @Test
    public void givenOneTwo_returnTwo() {
        int result = largestNumber.findLargestNumber(new int[]{1, 2});
        assertEquals(2, result);
    }

    @Test
    public void givenNumbers_returnSeven() {
        int result = largestNumber.findLargestNumber(new int[]{1, 2, 3, 4, 7, 5, 5});
        assertEquals(7, result);
    }

    @Test
    public void givenNumber_returnEight() {
        int result = largestNumber.findLargestNumber(new int[]{1, 2, 3, 4, 7, 5, 5, 8});
        assertEquals(8, result);
    }
}
