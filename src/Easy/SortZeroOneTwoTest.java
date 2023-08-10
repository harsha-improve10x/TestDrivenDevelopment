package Easy;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortZeroOneTwoTest {

    @Test
    public void nothing() {}

    @Test
    public void givenNull_returnEmpty() {
        SortZeroOneTwo sortZeroOneTwo = new SortZeroOneTwo();
        int[] result = sortZeroOneTwo.sortArray(null);
        assertArrayEquals(new int[]{}, result);
    }
}
