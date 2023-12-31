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

    @Test
    public void givenOneThree_returnTwo() {
        int missing = missingNumberArray.findMissingNumber(new int[]{1, 3}, 3);
        assertEquals(2, missing);
    }

    @Test
    public void givenOneThreeFourFive_returnTwo() {
        int missing = missingNumberArray.findMissingNumber(new int[]{1, 3, 4, 5}, 5);
        assertEquals(2, missing);
    }
}
