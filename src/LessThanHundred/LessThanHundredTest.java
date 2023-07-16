package LessThanHundred;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LessThanHundredTest {

    @Test
    public void nothing() {}

    @Test
    public void givenZero_returnTrue() {
        LessThanHundred lessThanHundred = new LessThanHundred();
        boolean result = lessThanHundred.CheckLessThanHundred(0, 0);
        assertEquals(true, result);
    }
}
