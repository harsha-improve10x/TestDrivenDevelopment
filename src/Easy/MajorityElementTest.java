package Easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MajorityElementTest {
    private MajorityElement majorityElement;

    @Test
    public void nothing() {}

    @BeforeEach
    public void setup() {
        majorityElement = new MajorityElement();
    }

    @Test
    public void givenNull_returnZero() {
        int result = majorityElement.findMajorityElement(null);
        assertEquals(0, result);
    }

    @Test
    public void givenEmpty_returnZero() {
        int result = majorityElement.findMajorityElement(new int[]{});
        assertEquals(0, result);
    }

    @Test
    public void givenOne_returnOne() {
        int result = majorityElement.findMajorityElement(new int[]{1});
        assertEquals(1, result);
    }

    @Test
    public void givenOneTwo_returnMinusOne() {
        int result = majorityElement.findMajorityElement(new int[]{1, 2});
        assertEquals(-1, result);
    }
}
