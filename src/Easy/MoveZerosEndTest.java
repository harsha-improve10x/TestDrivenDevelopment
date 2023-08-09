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

    @Test
    public void givenEmpty_returnEmpty() {
        MoveZerosEnd moveZerosEnd = new MoveZerosEnd();
        int[] result = moveZerosEnd.move(new int[]{});
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    public void givenZero_returnZero() {
        MoveZerosEnd moveZerosEnd = new MoveZerosEnd();
        int[] result = moveZerosEnd.move(new int[]{0});
        assertArrayEquals(new int[]{0}, result);
    }

    @Test
    public void givenZeroOne_returnOneZero() {
        MoveZerosEnd moveZerosEnd = new MoveZerosEnd();
        int[] result = moveZerosEnd.move(new int[]{0, 1});
        assertArrayEquals(new int[]{1, 0}, result);
    }

    @Test
    public void givenZeroOneTwo_returnOneTwoZero() {
        MoveZerosEnd moveZerosEnd = new MoveZerosEnd();
        int[] result = moveZerosEnd.move(new int[]{0, 1, 2});
        assertArrayEquals(new int[]{1, 2, 0}, result);
    }

    @Test
    public void givenThreeOneTwo_returnThreeOneTwo() {
        MoveZerosEnd moveZerosEnd = new MoveZerosEnd();
        int[] result = moveZerosEnd.move(new int[]{3, 1, 2});
        assertArrayEquals(new int[]{3, 1, 2,}, result);
    }
}
