package rotateclockwise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

public class RotateClockWiseTest {
    private RotateClockWise rotateClockWise;

    @Test
    public void nothing() {}

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
    public void givenNumbers_returnOutput() {
        int[] result = rotateClockWise.rotate(new int[]{1, 2, 3, 4, 5});
        assertArrayEquals(new int[]{5, 1, 2, 3, 4}, result);
    }
}
