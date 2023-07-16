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

    @Test
    public void givenTwentyTwoAnd5_returnTrue() {
        LessThanHundred lessThanHundred = new LessThanHundred();
        boolean result = lessThanHundred.CheckLessThanHundred(22, 5);
        assertEquals(true, result);
    }

    @Test
    public void givenMinusTwo_returnTrue() {
        LessThanHundred lessThanHundred = new LessThanHundred();
        boolean result = lessThanHundred.CheckLessThanHundred(-2, -34);
        assertEquals(true, result);
    }
}
