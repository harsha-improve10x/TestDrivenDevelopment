package HowMuchIsTrue;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class HowMuchIsTrueTest {

    @Test
    public void nothing() {}

    @Test
    public void givenNull_returnZero() {
        HowMuchIsTrue howMuchIsTrue = new HowMuchIsTrue();
        int result = howMuchIsTrue.countTrue(new String[]{""});
        assertEquals(0, result);
    }
}
