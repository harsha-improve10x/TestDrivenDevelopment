package Easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class SecondLargestNumberArrayTest {
    private SecondLargest secondLargest;

    @Test
    public void nothing() {}

    @BeforeEach
    public void setup() {
        secondLargest = new SecondLargest();
    }

    @Test
    public void givenNull_returnZero() {
        int result = secondLargest.findSecondLargest(null);
        assertEquals(0, result);
    }

    @Test
    public void givenEmpty_returnZero() {
        int result = secondLargest.findSecondLargest(new int[]{});
        assertEquals(0, result);
    }

    @Test
    public void givenZero_returnZero() {
        int result = secondLargest.findSecondLargest(new int[]{0});
        assertEquals(Integer.MIN_VALUE, result);
    }

    @Test
    public void givenOne_returnIntegerMinValue() {
        int result = secondLargest.findSecondLargest(new int[]{1});
        assertEquals(Integer.MIN_VALUE, result);
    }

    @Test
    public void givenOneTwo_returnOne() {
        int result = secondLargest.findSecondLargest(new int[]{1, 2});
        assertEquals(1, result);
    }
}
