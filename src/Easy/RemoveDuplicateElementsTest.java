package Easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

public class RemoveDuplicateElementsTest {
    private RemoveDuplicateElements removeDuplicateElements;

    @Test
    public void nothing() {}

    @BeforeEach
    private void setup() {
        removeDuplicateElements = new RemoveDuplicateElements();
    }

    @Test
    public void givenNull_returnZero() {
        int[] result = removeDuplicateElements.remove(null);
        assertArrayEquals(new int[]{0}, result);
    }

    @Test
    public void givenEmpty_returnZero() {
        int[] result = removeDuplicateElements.remove(new int[]{});
        assertArrayEquals(new int[]{0}, result);
    }

    @Test
    public void givenZero_returnZero() {
        int[] result = removeDuplicateElements.remove(new int[]{0});
        assertArrayEquals(new int[]{0}, result);
    }

    @Test
    public void givenOne_returnOne() {
        int[] result = removeDuplicateElements.remove(new int[]{1});
        assertArrayEquals(new int[]{1}, result);
    }

    @Test
    public void givenOneTwo_returnOneTwo() {
        int[] result = removeDuplicateElements.remove(new int[]{1, 2});
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    public void givenOneOneTwo_returnOneOneTwo() {
        int[] result = removeDuplicateElements.remove(new int[]{1, 1, 2});
        assertArrayEquals(new int[]{1, 2}, result);
    }
}
