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
}
