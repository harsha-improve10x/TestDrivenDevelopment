package isRightAngledTriangle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RightAngleTriangleTest {
    private RightAngleTriangle rightAngleTriangle;

    @Test
    public void nothing() {}

    @BeforeEach
    public void setup() {
        rightAngleTriangle = new RightAngleTriangle();
    }

    @Test
    public void givenZero_returnFalse() {
        boolean result = rightAngleTriangle.isRightTriangle(0, 0, 0);
        assertEquals(false, result);
    }

    @Test
    public void givenThreeFourFive_returnTrue() {
        boolean result = rightAngleTriangle.isRightTriangle(3, 4, 5);
        assertEquals(true, result);
    }

    @Test
    public void givenOneFortyFiveOneHundredAndFiveAndHundred_returnTrue() {
        boolean result = rightAngleTriangle.isRightTriangle(145, 105, 100);
        assertEquals(false, result);
    }

    @Test
    public void givenTwelveFiveAndThirteen_returnTrue() {
        boolean result = rightAngleTriangle.isRightTriangle(12, 5, 13);
        assertEquals(true, result);
    }
}
