package Easy;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

public class RearrangeArrayElementsBySignTest {
    private RearrangeArrayElementsBySign rearrangeArrayElementsBySign;

    @Test
    public void nothing() {}

    @Test
    public void setup() {
        rearrangeArrayElementsBySign = new RearrangeArrayElementsBySign();
    }

    @Test
    public void givenNull_returnEmpty() {
        int[] result = rearrangeArrayElementsBySign.rearrangeElements(null);
        assertArrayEquals(new int[]{}, result);
    }
}
