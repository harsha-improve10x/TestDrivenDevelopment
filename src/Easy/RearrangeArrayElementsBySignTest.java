package Easy;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

public class RearrangeArrayElementsBySignTest {

    @Test
    public void nothing() {}

    @Test
    public void givenNull_returnEmpty() {
        RearrangeArrayElementsBySign rearrangeArrayElementsBySign = new RearrangeArrayElementsBySign();
        int[] result = rearrangeArrayElementsBySign.rearrangeElements(null);
        assertArrayEquals(new int[]{}, result);
    }
}
