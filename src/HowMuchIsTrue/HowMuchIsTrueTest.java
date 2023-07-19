package HowMuchIsTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class HowMuchIsTrueTest {
    private HowMuchIsTrue howMuchIsTrue;

    @Test
    public void nothing() {}

    @BeforeEach
    public void setup() {
        howMuchIsTrue = new HowMuchIsTrue();
    }

    @Test
    public void givenNull_returnZero() {
        int result = howMuchIsTrue.countTrue(new String[]{""});
        assertEquals(0, result);
    }

    @Test
    public void givenTrue_returnOne() {
        int result = howMuchIsTrue.countTrue(new String[]{"True"});
        assertEquals(1, result);
    }

    @Test
    public void givenTrueFalse_returnOne() {
        int result = howMuchIsTrue.countTrue(new String[]{"True","False"});
        assertEquals(1, result);
    }

    @Test
    public void givenTrueFalseTruetrue_returnThree() {
        int result = howMuchIsTrue.countTrue(new String[]{"True","False","True","true"});
        assertEquals(3, result);
    }
}
