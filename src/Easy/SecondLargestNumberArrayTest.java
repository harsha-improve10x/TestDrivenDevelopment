package Easy;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class SecondLargestNumberArrayTest {

    @Test
    public void nothing() {}

    @Test
    public void givenNull_returnZero() {
        SecondLargest secondLargest = new SecondLargest();
        int result = secondLargest.findSecondLargest(null);
        assertEquals(0, result);
    }

}
