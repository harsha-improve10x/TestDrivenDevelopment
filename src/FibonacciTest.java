import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FibonacciTest {

    @Test
    public void nothing() {
    }

    @Test
    public void givenAnyNegativeInteger_returnsNegativeOne() {
        Fibonacci fibonacci = new Fibonacci();
        int negative = fibonacci.findNthNumber(-5);
        assertEquals(-1, negative);
    }

    @Test
    public void givenZero_returnsNegativeOne() {
        Fibonacci fibonacci = new Fibonacci();
        int negative = fibonacci.findNthNumber(0);
        assertEquals(-1, negative);
    }

    @Test
    public void givenOne_returnsZero() {
        Fibonacci fibonacci = new Fibonacci();
        int one = fibonacci.findNthNumber(1);
        assertEquals(0, one);
    }

    @Test
    public void givenTwo_returnsOne() {
        Fibonacci fibonacci = new Fibonacci();
        int secondNumber = fibonacci.findNthNumber(2);
        assertEquals(1, secondNumber);
    }

    @Test
    public void givenThree_returnsOne() {
        Fibonacci fibonacci = new Fibonacci();
        int thirdNumber = fibonacci.findNthNumber(3);
        assertEquals(1, thirdNumber);
    }

    @Test
    public void givenFive_returnsThree() {
        Fibonacci fibonacci = new Fibonacci();
        int fifthNumber = fibonacci.findNthNumber(5);
        assertEquals(3, fifthNumber);
    }
}
