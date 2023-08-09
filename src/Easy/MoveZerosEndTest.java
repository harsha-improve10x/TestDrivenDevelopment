package Easy;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

public class MoveZerosEndTest {

    @Test
    public void nothing() {}

    @Test
    public void givenNull_returnEmpty() {
        MoveZerosEnd moveZerosEnd = new MoveZerosEnd();
        int[] result = moveZerosEnd.move(null);
        assertArrayEquals(new int[]{}, result);
    }
}
