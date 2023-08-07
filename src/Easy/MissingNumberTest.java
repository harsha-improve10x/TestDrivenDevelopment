package Easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class MissingNumberTest {
    private  MissingNumberArray missingNumberArray;

    @Test
    public void nothing() {}

    @BeforeEach
    public void setup() {
        missingNumberArray = new MissingNumberArray();
    }

    @Test
    public void givenNull_returnZero() {
        int missing = missingNumberArray.findMissingNumber(null, 0);
        assertEquals(0, missing);
    }

    @Test
    public void givenEmpty_returnZero() {
        int missing = missingNumberArray.findMissingNumber(new int[]{}, 0);
        assertEquals(0, missing);
    }

    @Test
    public void givenOne_returnOne() {
        int missing = missingNumberArray.findMissingNumber(new int[]{1}, 1);
        assertEquals(1, missing);
    }
}
