package Easy;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class NumberAppearsOnceTest {

    @Test
    public void nothing() {}

    @Test
    public void givenNull_returnZero() {
        NumberAppearsOnce numberAppearsOnce = new NumberAppearsOnce();
        int result = numberAppearsOnce.countAppears(null);
        assertEquals(0, result);
    }
}
