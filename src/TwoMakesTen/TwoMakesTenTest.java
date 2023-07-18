package TwoMakesTen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoMakesTenTest {
    private TwoMakesTen twoMakesTen;
    /*
    Problem:  Create a function that takes two arguments. Both arguments are integers, a and b.
    Return true if one of them is 10 or if their sum is 10.
    Example:- makesTen(9, 10) ➞ true
            makesTen(9, 9) ➞ false
            makesTen(1, 9) ➞ true
     */
    @Test
    public void nothing() {
    }

    @BeforeEach
    public void setup() {
        twoMakesTen = new TwoMakesTen();
    }

    @Test
    public void givenEmpty_returnFalse() {
        boolean result = twoMakesTen.makesTen(0, 0);
        assertEquals(false, result);
    }

    @Test
    public void givenMinusTwoEight_returnTrue() {
        boolean result = twoMakesTen.makesTen(-2, 8);
        assertEquals(false, result);
    }

    @Test
    public void givenZeroTen_returnTrue() {
        boolean result = twoMakesTen.makesTen(0, 10);
        assertEquals(true, result);
    }

    @Test
    public void givenTenTen_returnTrue() {
        boolean result = twoMakesTen.makesTen(10, 10);
        assertEquals(true, result);
    }

    @Test
    public void givenOneNine_returnTrue() {
        boolean result = twoMakesTen.makesTen(1, 9);
        assertEquals(true, result);
    }
}
