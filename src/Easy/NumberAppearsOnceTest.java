package Easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class NumberAppearsOnceTest {
    private NumberAppearsOnce numberAppearsOnce;
    @Test
    public void nothing() {}

    @BeforeEach
    public void setup() {
        numberAppearsOnce = new NumberAppearsOnce();
    }

    @Test
    public void givenNull_returnZero() {
        int result = numberAppearsOnce.countAppears(null);
        assertEquals(0, result);
    }

    @Test
    public void givenEmpty_returnZero() {
        int result = numberAppearsOnce.countAppears(new int[]{});
        assertEquals(0, result);
    }

    @Test
    public void givenOne_returnOne() {
        int result = numberAppearsOnce.countAppears(new int[]{1});
        assertEquals(1, result);
    }
}
