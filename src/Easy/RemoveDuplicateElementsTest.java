package Easy;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

public class RemoveDuplicateElementsTest {

    @Test
    public void nothing() {}

    @Test
    public void givenNull_returnZero() {
        RemoveDuplicateElements removeDuplicateElements = new RemoveDuplicateElements();
        int[] result = removeDuplicateElements.remove(null);
        assertArrayEquals(new int[]{0}, result);
    }

    @Test
    public void givenEmpty_returnZero() {
        RemoveDuplicateElements removeDuplicateElements = new RemoveDuplicateElements();
        int[] result = removeDuplicateElements.remove(new int[]{});
        assertArrayEquals(new int[]{0}, result);
    }
}
