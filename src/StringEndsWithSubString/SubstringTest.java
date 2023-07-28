package StringEndsWithSubString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubstringTest {

    @Test
    public void nothing() {}

    @Test
    public void givenNull_returnEmpty() {
        Substring substring = new Substring();
        String result = substring.checkEnding(null, null);
        assertEquals("", result);
    }
}
