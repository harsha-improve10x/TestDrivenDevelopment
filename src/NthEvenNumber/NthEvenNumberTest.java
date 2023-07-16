package NthEvenNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NthEvenNumberTest {

    /*
    Problem: Create a function that takes a number n
             and returns the nth even number beginning with 0 as the first.
    Example: even(1) →0
    even(2) →2
    even(100) →198
     */
    @Test
    public void nothing(){}

    @Test
    public void givenEmpty_returnsZero() {
        NthEvenNumber nthEvenNumber = new NthEvenNumber();
        int result = nthEvenNumber.even(0);
        assertEquals(0, result);
    }

    @Test
    public void givenMinusFour_returnMinusOne() {
        NthEvenNumber nthEvenNumber = new NthEvenNumber();
        int result = nthEvenNumber.even(-4);
        assertEquals(-1, result);
    }
}
