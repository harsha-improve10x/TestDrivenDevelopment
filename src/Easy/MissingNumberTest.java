package Easy;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class MissingNumberTest {

    @Test
    public void nothing() {}

    @Test
    public void givenNull_returnZero() {
        MissingNumberArray missingNumberArray = new MissingNumberArray();
        int missing = missingNumberArray.findMissingNumber(null, 0);
        assertEquals(0, missing);
    }

}
