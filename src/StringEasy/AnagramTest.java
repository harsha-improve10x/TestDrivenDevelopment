package StringEasy;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class AnagramTest {

    @Test
    public void nothing() {}

    @Test
    public void givenEmpty_returnTrue() {
        Anagram anagram = new Anagram();
        boolean result = anagram.isAnagram("", "");
        assertEquals(true, result);
    }
}
