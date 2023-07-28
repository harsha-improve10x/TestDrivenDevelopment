package StringEndsWithSubString;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubstringTest {
    private Substring substring;

    @Test
    public void nothing() {}

    @BeforeEach
    public void setup() {
        substring = new Substring();
    }
    @Test
    public void givenNull_returnEmpty() {
        boolean result = substring.checkEnding(null, null);
        assertEquals(true, result);
    }

    @Test
    public void givenEmpty_returnEmpty() {
        boolean result = substring.checkEnding("", "");
        assertEquals(true, result);
    }

    @Test
    public void givenA_returnTrue() {
        boolean result = substring.checkEnding("a", "a");
        assertEquals(true, result);
    }
}
