package Easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortZeroOneTwoTest {
    private SortZeroOneTwo sortZeroOneTwo;

    @Test
    public void nothing() {}

    @BeforeEach
    public void setup() {
        sortZeroOneTwo = new SortZeroOneTwo();
    }

    @Test
    public void givenNull_returnEmpty() {
        int[] result = sortZeroOneTwo.sortArray(null);
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    public void givenEmpty_returnEmpty() {
        int[] result = sortZeroOneTwo.sortArray(new int[]{});
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    public void givenOne_returnOne() {
        int[] result = sortZeroOneTwo.sortArray(new int[]{1});
        assertArrayEquals(new int[]{1}, result);
    }

    @Test
    public void givenOneTwo_returnOneTwo() {
        int[] result = sortZeroOneTwo.sortArray(new int[]{1, 2});
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    public void givenOneTwoZeroZero_returnZeroZeroOneTwo() {
        int[] result = sortZeroOneTwo.sortArray(new int[]{1, 2, 0, 0});
        assertArrayEquals(new int[]{0, 0, 1, 2}, result);
    }
}
