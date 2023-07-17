package TheFarmProblem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FarmProblemTest {
    private Farm farm;
    /*
    Problem:    In this challenge, a farmer is asking you to tell him how many legs
                can be counted among all his animals. The farmer breeds three species:
                chickens = 2 legs
                cows = 4 legs
                pigs = 4 legs
                The farmer has counted his animals and he gives you a subtotal for each species.
                You have to implement a function that returns the total number of legs of all the animals.
    Examples:   animals(2, 3, 5) ➞ 36
                animals(1, 2, 3) ➞ 22
                animals(5, 2, 8) ➞ 50
     */

    @Test
    public void nothing() {
    }

    @BeforeEach
    public void setup() {
        farm = new Farm();
    }

    @Test
    public void givenZeroZeroZero_returnZero() {
        int result = farm.animals(0, 0, 0);
        assertEquals(0, result);
    }

    @Test
    public void givenTwoThreeFive_returnThirtySix() {
        int result = farm.animals(2, 3, 5);
        assertEquals(36, result);
    }

    @Test
    public void givenFiveTwoEight_returnFifty() {
        int result = farm.animals(5, 2, 8);
        assertEquals(50, result);
    }

    @Test
    public void givenMinusFifteenThreeMinusTwo_returnMinusTwentySix() {
        int result = farm.animals(-15, 3, -2);
        assertEquals(-26, result);
    }
}
