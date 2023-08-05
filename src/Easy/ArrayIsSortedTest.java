package Easy;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class ArrayIsSortedTest {

    @Test
    public void nothing() {}

    @Test
    public void givenNull_returnFalse() {
        SortArray sortArray = new SortArray();
        boolean result = sortArray.isArraySorted(null);
        assertEquals(false, result);
    }

    @Test
    public void givenEmpty_returnTrue() {
        SortArray sortArray = new SortArray();
        boolean result = sortArray.isArraySorted(new int[]{});
        assertEquals(true, result);
    }
}
