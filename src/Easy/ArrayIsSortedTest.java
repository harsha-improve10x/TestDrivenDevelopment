package Easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class ArrayIsSortedTest {
    private SortArray sortArray;
    @Test
    public void nothing() {}

    @BeforeEach
    private void setup(){
        sortArray = new SortArray();
    }

    @Test
    public void givenNull_returnFalse() {
        boolean result = sortArray.isArraySorted(null);
        assertEquals(false, result);
    }

    @Test
    public void givenZero_returnTrue() {
        boolean result = sortArray.isArraySorted(new int[]{0});
        assertEquals(true, result);
    }
}
