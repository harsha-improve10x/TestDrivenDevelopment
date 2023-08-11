package Easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

public class RearrangeArrayElementsBySignTest {
    private RearrangeArrayElementsBySign rearrangeArrayElementsBySign;

    @Test
    public void nothing() {}

    @BeforeEach
    public void setup() {
        rearrangeArrayElementsBySign = new RearrangeArrayElementsBySign();
    }

    @Test
    public void givenNull_returnEmpty() {
        int[] result = rearrangeArrayElementsBySign.rearrangeElements(null);
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    public void givenEmpty_returnEmpty() {
        int[] result = rearrangeArrayElementsBySign.rearrangeElements(new int[]{});
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    public void givenOne_returnOne() {
        int[] result = rearrangeArrayElementsBySign.rearrangeElements(new int[]{1});
        assertArrayEquals(new int[]{1}, result);
    }
}
