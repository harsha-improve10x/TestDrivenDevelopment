package Easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

public class LeftRotateArrayTest {
    private LeftRotateArray leftRotateArray;

    @Test
    public void nothing() {}

    @BeforeEach
    public void setup() {
        leftRotateArray = new LeftRotateArray();
    }

    @Test
    public void givenNull_returnZero() {
        int[] result = leftRotateArray.rotate(null);
        assertArrayEquals(new int[]{0}, result);
    }

    @Test
    public void givenEmpty_returnZero() {
        int[] result = leftRotateArray.rotate(new int[]{});
        assertArrayEquals(new int[]{0}, result);
    }

    @Test
    public void givenZero_returnZero() {
        int[] result = leftRotateArray.rotate(new int[]{0});
        assertArrayEquals(new int[]{0}, result);
    }

    @Test
    public void givenOne_returnOne() {
        int[] result = leftRotateArray.rotate(new int[]{1});
        assertArrayEquals(new int[]{1}, result);
    }

    @Test
    public void givenOneTwo_returnTwoOne() {
        int[] result = leftRotateArray.rotate(new int[]{1, 2});
        assertArrayEquals(new int[]{2, 1}, result);
    }

    @Test
    public void givenOneTwoThreeFourFive_returnFiveOneTwoThreeFour() {
        int[] result = leftRotateArray.rotate(new int[]{1, 2, 3, 4, 5});
        assertArrayEquals(new int[]{2, 3, 4, 5, 1}, result);
    }
}
