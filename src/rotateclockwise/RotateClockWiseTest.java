package rotateclockwise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

public class RotateClockWiseTest {
    private RotateClockWise rotateClockWise;

    @Test
    public void nothing() {
    }

    @BeforeEach
    public void setup() {
        rotateClockWise = new RotateClockWise();
    }

    @Test
    public void givenEmpty_returnEmpty() {
        int[] result = rotateClockWise.rotate(new int[]{});
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    public void givenFive_returnFive() {
        int[] result = rotateClockWise.rotate(new int[]{5});
        assertArrayEquals(new int[]{5}, result);
    }

    @Test
    public void givenOneTwo_returnTwoOne() {
        int[] result = rotateClockWise.rotate(new int[]{1, 2});
        assertArrayEquals(new int[]{2, 1}, result);
    }

    @Test
    public void givenNumbers_returnRotatedNumbers() {
        int[] result = rotateClockWise.rotate(new int[]{1, 2, 3, 4, 5});
        assertArrayEquals(new int[]{5, 1, 2, 3, 4}, result);
    }

    @Test
    public void givenRandomNumbers_returnRotatedNumbers() {
        int[] result = rotateClockWise.rotate(new int[]{1, 2, 3, 4, 5, -12});
        assertArrayEquals(new int[]{-12, 1, 2, 3, 4, 5}, result);
    }
}
