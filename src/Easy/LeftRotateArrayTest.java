package Easy;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

public class LeftRotateArrayTest {

    @Test
    public void nothing() {}

    @Test
    public void givenNull_returnNull() {
        LeftRotateArray leftRotateArray = new LeftRotateArray();
        int[] result = leftRotateArray.rotate(null);
        assertArrayEquals(new int[]{0}, result);
    }
}
