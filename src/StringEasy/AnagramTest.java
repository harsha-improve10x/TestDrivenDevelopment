package StringEasy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class AnagramTest {
    private Anagram anagram;

    @Test
    public void nothing() {}

    @BeforeEach
    public void setup() {
        anagram = new Anagram();
    }

    @Test
    public void givenEmpty_returnTrue() {
        boolean result = anagram.isAnagram("", "");
        assertEquals(true, result);
    }

    @Test
    public void givenAEmpty_returnFalse() {
        boolean result = anagram.isAnagram("A", "");
        assertEquals(false, result);
    }

    @Test
    public void givenEmptyA_returnFalse() {
        boolean result = anagram.isAnagram("", "A");
        assertEquals(false, result);
    }

    @Test
    public void givenAA_returnTrue() {
        boolean result = anagram.isAnagram("A", "A");
        assertEquals(true, result);
    }

    @Test
    public void givenAbcBac_returnTrue() {
        boolean result = anagram.isAnagram("Abc", "Bac");
        assertEquals(true, result);
    }

    @Test
    public void givenAbcBdcA_returnFalse() {
        boolean result = anagram.isAnagram("Abc", "BdcA");
        assertEquals(false, result);
    }

    @Test
    public void givenCatAct_returnTrue() {
        boolean result = anagram.isAnagram("Cat", "Act");
        assertEquals(true, result);
    }

    @Test
    public void givenRulesLesrt_returnFalse() {
        boolean result = anagram.isAnagram("Rules", "Lesrt");
        assertEquals(false, result);
    }
}
